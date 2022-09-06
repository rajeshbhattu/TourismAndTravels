package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Places;
import com.example.demo.repo.PlacesRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacesServiceImpl implements PlacesService {
	@Autowired
	private PlacesRepo placeRepo;

	@Override
	public Places savePlaces(Places plces) {
		return placeRepo.save(plces);
	}

	@Override
	public List<Places> getAllPlaces() {
		
		return placeRepo.findAll();
	}

	@Override
	public Places findPlaceById(Integer placeId) {
		
		return placeRepo.getById(placeId);
	}

	
	/*
	 * @Override public String updatePlaceByName(String placeName) {
	 * 
	 * if (placeRepo.fin.isPresent()){ Vehicle existingVehicle =
	 * vehicleRepository.findById(id).get();
	 * 
	 * existingVehicle.setMake(vehicleUpdateDTO.getMake());
	 * existingVehicle.setModel(vehicleUpdateDTO.getModel());
	 * 
	 * Vehicle updatedVehicle = vehicleRepository.save(existingVehicle);
	 * 
	 * return new VehicleQueryDTO(updatedVehicle.getId(),
	 * updatedVehicle.getVehicleIdentityNumber(), updatedVehicle.getMake(),
	 * updatedVehicle.getModel()); }else{ return null; }
	 * 
	 * }
	 */
	 

	@Override
	public void deletePlace(Integer placeId) {
		placeRepo.deleteById(placeId);
	}

	
	
	public Places updatePlaceByName(String placeName, Places places) {
		
		Places UpdatedPlaces=placeRepo.findByplaceName(placeName);
		UpdatedPlaces.setPlaceName(places.getPlaceName());
		UpdatedPlaces.setDescription(places.getDescription());
		UpdatedPlaces.setStatecode(places.getStatecode());
		UpdatedPlaces.setImage(places.getImage());
		
		return placeRepo.save(UpdatedPlaces);
	}

}
