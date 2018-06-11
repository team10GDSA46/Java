package com.nus.iss.practice.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nus.iss.practice.model.Facility;
import com.nus.iss.practice.repository.FacilityRepository;


@Service
public class FacilityServiceImpl implements FacilityService {

	@Resource
	private FacilityRepository facilityRepository;
	
	@Override
	@Transactional
	public ArrayList<Facility> findAllFacility() {
		return (ArrayList<Facility>)facilityRepository.findAll();
	}

}
