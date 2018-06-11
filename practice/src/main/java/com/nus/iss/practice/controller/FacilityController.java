package com.nus.iss.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nus.iss.practice.model.Facility;
import com.nus.iss.practice.service.FacilityService;


@RequestMapping(value="/facility")
@Controller
public class FacilityController {

	@Autowired
	private FacilityService fService;
	
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public ModelAndView facilityListPage()
	{
		ModelAndView mav = new ModelAndView("testpage");
		List<Facility> facilityList = fService.findAllFacility();
		mav.addObject("facilityList", facilityList);
		return mav;
	}
}
