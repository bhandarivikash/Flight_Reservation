package com.Flight.Dto;

public class ReservationUpdateRequest {

	private long id;
	private boolean checkedIn;
	private int numbersOfBags;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumbersOfBags() {
		return numbersOfBags;
	}
	public void setNumbersOfBags(int numbersOfBags) {
		this.numbersOfBags = numbersOfBags;
	}
	
	
}
