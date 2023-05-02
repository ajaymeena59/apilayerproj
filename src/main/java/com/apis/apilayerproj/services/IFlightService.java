package com.apis.apilayerproj.services;

import java.util.List;

import com.apis.apilayerproj.models.Flight;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface IFlightService {
	
	public List<Flight> getFlights();
	
}
