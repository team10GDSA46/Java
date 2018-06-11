package com.nus.iss.practice.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nus.iss.practice.model.Facility;

public interface FacilityRepository extends JpaRepository<Facility, Integer>{
	
}
