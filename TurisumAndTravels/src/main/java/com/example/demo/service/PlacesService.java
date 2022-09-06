package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Places;

import org.springframework.stereotype.Service;


public interface PlacesService {

	public Places savePlaces(Places plces);

	public List<Places> getAllPlaces();

	public Places findPlaceById(Integer placeId);

	public Places updatePlaceByName(String placeName,Places places);

	public void deletePlace(Integer placeId);
}
