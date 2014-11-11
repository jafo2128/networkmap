package com.pk.network.map.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationDao dao;

	@Override
	public void create(Location location) {
		location.setAddress("Testing");
		location.setCity("Testing");
		location.setContactName("Testing");
		location.setContactPhone("Testing");
		location.setIpAddress("Testing");
		location.setLatitude("Testing");
		location.setLocation("Testing");
		location.setLongitude("Testing");
		location.setName("Testing");
		location.setState("Testing");
		location.setZip("Testing");
		dao.create(location);
		
	}

	@Override
	public void read(Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Location> list() {
		return dao.list();
	}
	
}
