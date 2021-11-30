package com.flightapp.user.service.beans;

import java.util.List;

public class BookingRequest {
	
	private TicketDetails ticketDetails;
	private List<Passengers> passengers;
	
	public BookingRequest() {
		
	}
	
	public TicketDetails getTicketDetails() {
		return ticketDetails;
	}
	public void setTicketDetails(TicketDetails ticketDetails) {
		this.ticketDetails = ticketDetails;
	}
	public List<Passengers> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
	}
	
	

}
