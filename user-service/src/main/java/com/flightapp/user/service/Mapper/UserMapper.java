package com.flightapp.user.service.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.flightapp.user.service.beans.Airlines;
import com.flightapp.user.service.beans.BookingDetails;
import com.flightapp.user.service.beans.TicketDetails;

@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM TICKET_DETAILS WHERE FLIGHT_NUMBER=#{flightNumber}")
	public List<BookingDetails> getBookingData(int flightNumber);
	
	@Select("SELECT * FROM AIRLINES WHERE SOURCEE=#{sourcee} AND DESTINATION=#{destination} AND IS_BLOCKED='N' ")
	public List<Airlines> getFlights(String sourcee, String destination);
	
	@Select("SELECT PNR FROM TICKET_DETAILS WHERE FLIGHT_NUMBER=#{flightNumber}")
	public int getPnrFromFlightNumber(int flightNumber);
	
	@Select("SELECT * FROM TICKET_DETAILS WHERE PNR=#{pnr}")
	public TicketDetails getTicketDetail(int pnr);
	
	@Select("SELECT * FROM TICKET_DETAILS WHERE BOOKED_BY_MAIL=#{bookerMail}")
	public List<BookingDetails> getTicketDetails(String bookerMail);
	
	@Insert("INSERT INTO PASSENGERS VALUES(#{pnr},#{name},#{gender},#{age})")
	public void addPassengers(int pnr,String name,String gender,int age);
	
	@Insert("INSERT INTO TICKET_DETAILS VALUES(#{flightNumber},#{datee},#{sourcee},#{destination},#{bookedByName},#{bookedByMail},#{seats},#{meal},PNR_INCREMENT.NEXTVAL)")
	public void bookTicket(TicketDetails details);
	
	@Delete("DELETE FROM TICKET_DETAILS WHERE PNR=#{pnr}")
	public void cancelTicket(int pnr);
	
	
	
	
	
	
	
	
}
