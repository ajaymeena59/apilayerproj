package com.apis.apilayerproj.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apis.apilayerproj.services.FlightService;
import com.apis.apilayerproj.services.IFlightService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class FlightConfig {

	@Bean
	public ObjectMapper getObjMapp() {
		return new ObjectMapper();
	}
	
	@Bean
	public IFlightService getFService() {
		
		IFlightService fService = new FlightService();
		return fService;
	}
	
}
