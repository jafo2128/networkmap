package com.pk.network.dao;

import com.pk.network.model.Location;

import java.util.List;

public interface LocationDao {
	public void create(Location location);
	public void read(Location location);
	public void update(Location location);
	public void delete(Location location);
	
	public List<Location> list();

}
