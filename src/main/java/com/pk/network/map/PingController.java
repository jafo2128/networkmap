package com.pk.network.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PingController {
	
	@Autowired
	PingService pingService;
	
	@RequestMapping("/")
	public String showLocations() {
		// Run DAO and pull all pings
		return "map";
	}
	
	// DAO for Pings. Search database for all active connections.
	
	// Run ping and return results
	
	// Return {City, State} {Long, Lat} {IP Address} {Ping Value}
	
	

}
