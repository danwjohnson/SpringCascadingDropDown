package com.dan.training.springmvc.dropdowns.service;

import java.util.Set;

import com.dan.training.springmvc.dropdowns.domain.City;
import com.dan.training.springmvc.dropdowns.domain.State;

public interface GeoService {

	public Set<State> findAllStates();
	
	public Set<City> findCitiesForState(String state);
	
}
