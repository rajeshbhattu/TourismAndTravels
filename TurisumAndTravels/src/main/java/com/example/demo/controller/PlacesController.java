package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.Places;
import com.example.demo.service.PlacesServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacesController {
	@Autowired
	private PlacesServiceImpl placeImpl;

	@PostMapping("/addplaces")
	public Places addPlaces(@RequestBody Places places) {
		return placeImpl.savePlaces(places);
	}

	@GetMapping("/getplaces")
	public List<Places> getPlaces(Places plces) {

		return placeImpl.getAllPlaces();
	}

	@GetMapping("/getId/{placeId}")
	public Places getPlaceById(@RequestBody Integer places) {
		return placeImpl.findPlaceById(places);
	}

	/*
	 * @PutMapping("/updateplace") public Places updatePlaces(@RequestBody String
	 * placeName) { return placeImpl.updatePlaceByName(placeName, null);
	 * 
	 * }
	 */
	@DeleteMapping("/deleteplace")
	public void deletePlaces(@RequestBody Integer placeId) {
		placeImpl.deletePlace(placeId);
		
	}
}
