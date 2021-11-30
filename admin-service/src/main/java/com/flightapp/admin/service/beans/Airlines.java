package com.flightapp.admin.service.beans;

import org.springframework.stereotype.Component;

@Component
public class Airlines {
	
	private int flightNumber;
	private String airline;
	private String sourcee;
	private String destination;
	private int start;
	private int end;
	private int airlineModel;
	private String meal;
	private String isBlocked;
	
	
	public Airlines() {

	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSource() {
		return sourcee;
	}
	public void setSource(String source) {
		this.sourcee = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getAirlineModel() {
		return airlineModel;
	}
	public void setAirlineModel(int airlineModel) {
		this.airlineModel = airlineModel;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getIsBlocked() {
		return isBlocked;
	}
	public void setIsBlocked(String isBlocked) {
		this.isBlocked = isBlocked;
	}
	
	

}
