package com.pk.network.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.pk.network.map.location.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("locationDao")
@Transactional
public class LocationDaoImpl implements LocationDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(Location location) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(location);
		
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Location> list() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Location").list();
	}

	
}
