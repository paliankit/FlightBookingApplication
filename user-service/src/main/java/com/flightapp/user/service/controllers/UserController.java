package com.flightapp.user.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.user.service.Mapper.UserMapper;
import com.flightapp.user.service.beans.Airlines;
import com.flightapp.user.service.beans.BookingRequest;
import com.flightapp.user.service.beans.TicketSearchRequest;



@RestController
public class UserController {

	@Autowired
	private UserMapper mapper;
	
	@PostMapping("/search")
	public List<Airlines> searchFlights(@RequestBody TicketSearchRequest request) throws Exception {
		
		return mapper.getFlights(request.getSourcee(),request.getDestination());
		
	}

	@PostMapping("/booking")
	public String bookFlights(@RequestBody BookingRequest request) {
		try {
			mapper.bookTicket(request.getTicketDetails());
			for(int i=0; i<request.getPassengers().size(); i++) {
				mapper.addPassengers(mapper.getPnrFromFlightNumber(request.getTicketDetails().getFlightNumber()),
						request.getPassengers().get(i).getName(),
						request.getPassengers().get(i).getGender(),
						request.getPassengers().get(i).getAge());
			}
			return "Flight Booked";
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}

}
