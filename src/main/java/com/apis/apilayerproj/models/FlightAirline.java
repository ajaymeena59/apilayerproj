package com.apis.apilayerproj.models;

public class FlightAirline {
	
	private String name;
	private String iata;
	private String icao;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	@Override
	public String toString() {
		return "Airline [name=" + name + ", iata=" + iata + ", icao=" + icao + "]";
	}
}
