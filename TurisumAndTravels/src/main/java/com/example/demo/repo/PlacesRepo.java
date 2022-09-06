package com.example.demo.repo;

import java.util.List;

import com.example.demo.entity.Places;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PlacesRepo extends JpaRepository<Places, Integer> {
	
	public Places findByplaceName(String placeName);
	

}
