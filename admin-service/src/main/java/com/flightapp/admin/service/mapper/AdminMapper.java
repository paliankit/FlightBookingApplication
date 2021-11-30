package com.flightapp.admin.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.flightapp.admin.service.beans.Airlines;

@Mapper
public interface AdminMapper {
	
	@Insert("INSERT INTO AIRLINES VALUES(#{flightNumber},#{airline},#{sourcee},#{destination},#{start},#{end},#{airlineModel},#{meal},#{isBlocked})")
	public void createAirlines(Airlines airline);
	
	@Update("UPDATE AIRLINES SET IS_BLOCKED='Y' WHERE AIRLINE=#{airline}")
	public void blockAirline(String airline);
	
	@Update("UPDATE AIRLINES SET IS_BLOCKED='N' WHERE AIRLINE=#{airline}")
	public void unblockAirline(String airline);
	
	@Select("SELECT * FROM AIRLINES WHERE AIRLINE=#{airline}")
	public List<Airlines> checkBlockedStatus(String airline);
	
	@Select("SELECT * FROM AIRLINES WHERE AIRLINE=#{airline} LIMIT 1")
	public void oneRow(Airlines airline);

}
