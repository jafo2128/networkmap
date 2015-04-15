package com.pk.network.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pk.network.service.LocationService;

@Controller
public class PingController {
	
	@Autowired
	PingService pingService;
	
	@Autowired
	LocationService locationService;
	
	@RequestMapping("/")
	public String showLocations() {
		// Run DAO and pull all pings
		//locationService.create(new Location());
		return "map";
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		System.out.println(locationService.list());
		mav.setViewName("map");
		return mav;
	}
	
	@RequestMapping("/location")
	public ModelAndView locationView() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("location");
		return mav;
	}
	
	// DAO for Pings. Search database for all active connections.
	
	// Run ping and return results
	
	// Return {City, State} {Long, Lat} {IP Address} {Ping Value}
	
	

}
