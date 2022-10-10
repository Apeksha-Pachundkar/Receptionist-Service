package com.receptionist.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ReservationDetails")
public class Reservation {

	@Id
	private Long bookingId;
	private Long roomId;
	private Long guestId;
	private String checkin;
	private String checkout;
	private int numOfGuests;
	private double finalPrice;
	
	

	public Reservation(Long bookingId, Long roomId, Long guestId, String checkin, String checkout, int numOfGuests,
			double finalPrice) {
		super();
		this.bookingId = bookingId;
		this.roomId = roomId;
		this.guestId = guestId;
		this.checkin = checkin;
		this.checkout = checkout;
		this.numOfGuests = numOfGuests;
		this.finalPrice = finalPrice;
	}

	public Reservation() {
		super();

	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	
	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public int getNumOfGuests() {
		return numOfGuests;
	}

	public void setNumOfGuests(int numOfGuests) {
		this.numOfGuests = numOfGuests;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}


}

