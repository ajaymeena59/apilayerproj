package com.apis.apilayerproj.models;

public class Flight {
	private String flight_date;
	private String flight_status;
	private FlightDeparture departure;
	private FlightArrival arrival;
	private FlightAirline airline;
	private FlightInfo flight;
	private FlightAircraft aircraft;
	private FlightLive live;
	
	public String getFlight_date() {
		return flight_date;
	}
	public void setFlight_date(String flight_date) {
		this.flight_date = flight_date;
	}
	public String getFlight_status() {
		return flight_status;
	}
	public void setFlight_status(String flight_status) {
		this.flight_status = flight_status;
	}
	public FlightDeparture getDeparture() {
		return departure;
	}
	public void setDeparture(FlightDeparture departure) {
		this.departure = departure;
	}
	public FlightArrival getArrival() {
		return arrival;
	}
	public void setArrival(FlightArrival arrival) {
		this.arrival = arrival;
	}
	public FlightAirline getAirline() {
		return airline;
	}
	public void setAirline(FlightAirline airline) {
		this.airline = airline;
	}
	public FlightInfo getFlight() {
		return flight;
	}
	public void setFlight(FlightInfo flight) {
		this.flight = flight;
	}
	public FlightAircraft getAircraft() {
		return aircraft;
	}
	public void setAircraft(FlightAircraft aircraft) {
		this.aircraft = aircraft;
	}
	public FlightLive getLive() {
		return live;
	}
	public void setLive(FlightLive live) {
		this.live = live;
	}
	@Override
	public String toString() {
		return "FlightData [flight_date=" + flight_date + ", flight_status=" + flight_status + ", departure="
				+ departure + ", arrival=" + arrival + ", airline=" + airline + ", flight=" + flight + ", aircraft="
				+ aircraft + ", live=" + live + "]";
	}
	
} 