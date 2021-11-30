package com.flightapp.user.service.beans;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookingDetails {
	
	private int flightNumber;
	private  int datee;
	private int sourcee;
	private int destination;
	private String bookedByName;
	private String bookedByMail;
	private int seats;
	private List<Passengers> passengers;
	private String meal;
	
	public BookingDetails() {
		
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
	public int getSourcee() {
		return sourcee;
	}
	public void setSourcee(int sourcee) {
		this.sourcee = sourcee;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
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
	public List<Passengers> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	
	
	

}
