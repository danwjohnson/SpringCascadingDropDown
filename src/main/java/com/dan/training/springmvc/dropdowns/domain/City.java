package com.dan.training.springmvc.dropdowns.domain;

public class City {

	private Long id;
	private String name;
	private State state;
	
	public City() {
		
		this.name = "unknown";
		this.state = new State("unkown");
		this.id = System.currentTimeMillis();
		
	}
	
	
	public City(String name) {
		
		this.name = name;
		this.state = new State("unknown");
		this.id = System.currentTimeMillis();
		
	}
	
	
	public int compareTo(City o) {
		
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


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		City other = (City) obj;
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
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}


	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("City [ ");
		sb.append("id=").append(this.id).append(',');
		sb.append("name=").append(this.name).append(' ');
		sb.append("state=").append(this.state.getName()).append(' ');
		sb.append("]");
		return sb.toString();
	}
	
	
}
