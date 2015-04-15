package com.pk.network.service;

import com.pk.network.map.location.Location;

import java.util.List;

public interface LocationService {
	public void create(Location location);
	public void read(Location location);
	public void update(Location location);
	public void delete(Location location);
	
	public List<Location> list();
	
}
