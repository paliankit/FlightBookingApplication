package com.flightapp.user.service.beans;

import java.util.List;

public class TicketDetails {
	
	private int flightNumber;
	private  int datee;
	private String sourcee;
	private String destination;
	private String bookedByName;
	private String bookedByMail;
	private int seats;
	private String meal;
	private int pnr;
	
	public TicketDetails() {
		
	}
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getDatee() {
		return datee;
	}
	public void setDatee(int datee) {
		this.datee = datee;
	}
	public String getSourcee() {
		return sourcee;
	}
	public void setSourcee(String sourcee) {
		this.sourcee = sourcee;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getBookedByName() {
		return bookedByName;
	}
	public void setBookedByName(String bookedByName) {
		this.bookedByName = bookedByName;
	}
	public String getBookedByMail() {
		return bookedByMail;
	}
	public void setBookedByMail(String bookedByMail) {
		this.bookedByMail = bookedByMail;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	
	

}
