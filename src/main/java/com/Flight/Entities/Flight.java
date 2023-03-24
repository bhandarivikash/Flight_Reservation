package com.Flight.Entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity{

	private String flightNumbers;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimateDepartureTime;
	
	public String getFlightNumbers() {
		return flightNumbers;
	}
	public void setFlightNumbers(String flightNumbers) {
		this.flightNumbers = flightNumbers;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	
	public Timestamp getEstimateDepartureTime() {
		return estimateDepartureTime;
	}
	public void setEstimateDepartureTime(Timestamp estimateDepartureTime) {
		this.estimateDepartureTime = estimateDepartureTime;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	
	
}
