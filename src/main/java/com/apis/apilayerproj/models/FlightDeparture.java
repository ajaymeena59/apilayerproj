package com.apis.apilayerproj.models;

public class FlightDeparture {
    
	private String airport;
	private String timezone;
	private String iata;
	private String icao;
	private String terminal;
	private String gate;
	private int delay;
	private String scheduled;
	private String estimated;
	private String actual;
	private String estimated_runway;
	private String actual_runway;
	
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
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
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	public String getScheduled() {
		return scheduled;
	}
	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}
	public String getEstimated() {
		return estimated;
	}
	public void setEstimated(String estimated) {
		this.estimated = estimated;
	}
	public String getActual() {
		return actual;
	}
	public void setActual(String actual) {
		this.actual = actual;
	}
	public String getEstimated_runway() {
		return estimated_runway;
	}
	public void setEstimated_runway(String estimated_runway) {
		this.estimated_runway = estimated_runway;
	}
	public String getActual_runway() {
		return actual_runway;
	}
	public void setActual_runway(String actual_runway) {
		this.actual_runway = actual_runway;
	}
	@Override
	public String toString() {
		return "Departure [airport=" + airport + ", timezone=" + timezone + ", iata=" + iata + ", icao=" + icao
				+ ", terminal=" + terminal + ", gate=" + gate + ", delay=" + delay + ", scheduled=" + scheduled
				+ ", estimated=" + estimated + ", actual=" + actual + ", estimated_runway=" + estimated_runway
				+ ", actual_runway=" + actual_runway + "]";
	}
	
	
}
