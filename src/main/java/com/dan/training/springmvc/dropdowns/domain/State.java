package com.dan.training.springmvc.dropdowns.domain;

import java.util.Set;
import java.util.TreeSet;

public class State implements Comparable<State>{

	private Long id;
	private String name;
	private Set<City> cities = new TreeSet<City>();
	
	
	public State() {
		
		this.name = "unknown";
		this.id = System.currentTimeMillis();
		
	}
	
	
	public State(String name) {
		
		this.name = name;
		this.id = System.currentTimeMillis();
		
	}
	
	
	public State addCity(City city) {
		
		this.cities.add(city);
		city.setState(this);
		return this;
		
	}
	
	
	public State addCity(String name) {
		
		City city = new City(name);
		this.cities.add(city);
		return this;
		
	}
	
	
	public int compareTo(State o) {
	
		return this.name.compareTo(o.name);
	
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<City> getCities() {
		return cities;
	}


	public void setCities(Set<City> cities) {
		this.cities = cities;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("State [ ");
		sb.append("id=").append(this.id).append(',');
		sb.append("name=").append(this.name).append(' ');
		sb.append("n cities=").append(this.cities.size()).append(' ');
		sb.append("]");
		return sb.toString();
	}
	

}
