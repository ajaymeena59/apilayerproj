package com.apis.apilayerproj.controllers;

import org.springframework.stereotype.Controller;
import com.apis.apilayerproj.services.IFlightService;
import org.springframework.web.bind.annotation.RequestMapping;
import com.apis.apilayerproj.configs.FlightConfig;
import com.apis.apilayerproj.models.Flight;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Controller
public class FlightController {
	
	private ApplicationContext context = new AnnotationConfigApplicationContext(FlightConfig.class);
	
	private IFlightService fService = (IFlightService)context.getBean("getFService"); 
	
	@RequestMapping("/flights")
	public String getFlights(Model model) {
		
	   List<Flight> flights = fService.getFlights();
	
	   model.addAttribute("flights", flights);
		
		return "flights";
	}

}
