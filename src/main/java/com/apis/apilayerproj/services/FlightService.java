package com.apis.apilayerproj.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import com.apis.apilayerproj.models.Flight;
import com.apis.apilayerproj.models.FlightResp;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FlightService implements IFlightService {
	
	@Autowired
	private ObjectMapper objMap;

	public List<Flight> getFlights() {
		
		HttpRequest request =  HttpRequest.newBuilder(URI.create("http://api.aviationstack.com/v1/flights?access_key=your_access_key_from_official_aviationstack_website")).GET().build();
		
		try {
			HttpResponse<String> response = HttpClient.newHttpClient().send(request,  HttpResponse.BodyHandlers.ofString());
	//		 System.out.println(response); System.out.println(response.body());
		 	
			if(response.statusCode()==200) {
			FlightResp flightResp = objMap.readValue(response.body(),FlightResp.class);
		  List<Flight> flights =	flightResp.getData();
		
		  return flights;
			}		
		}  catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		return null;
		
	}

}
