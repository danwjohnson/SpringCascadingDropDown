package com.dan.training.springmvc.dropdowns.service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

import com.dan.training.springmvc.dropdowns.domain.City;
import com.dan.training.springmvc.dropdowns.domain.State;

@Service
public class DefaultGeoService implements GeoService{

	private Map<String, State> states = new LinkedHashMap<String, State>();
	
	public DefaultGeoService() {
		
		State state = new State("NJ");
		state.addCity("Haddonfield").addCity("Cherry Hill").addCity("Marlton");
		this.states.put(state.getName(), state);
		
		state = new State("PA");
		state.addCity("Philadelphia").addCity("Pittsburgh").addCity("Alabama");
		this.states.put(state.getName(), state);
		
		state = new State("NY");
		state.addCity("Sewer").addCity("Flushing").addCity("Armpit");
		this.states.put(state.getName(), state);
		
	}
	
	public Set<State> findAllStates() {
		
		Set<State> set = new TreeSet<State>();
		set.addAll(this.states.values());
		return set;
		
	}

	
	public Set<City> findCitiesForState(String stateName) {
	
		State state = this.states.get(stateName);
		return state.getCities();
		
	}

}
