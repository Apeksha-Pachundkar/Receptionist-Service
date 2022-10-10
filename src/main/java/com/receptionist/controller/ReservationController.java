package com.receptionist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.receptionist.model.Reservation;
import com.receptionist.model.ReservationList;
import com.receptionist.service.ReservationServiceImpl;


@RestController
@CrossOrigin(origins ="http://localhost:4200" )
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private ReservationServiceImpl service;
	
	@RequestMapping("/Reservation")
	public List<Reservation> getAllReservation()
	{
		return service.getAllReservation();	
	}
	
	@GetMapping("/ShowAllReservations")
	public ReservationList getResList() {
	ReservationList list = new ReservationList();
		list.setResList(this.service.getResList());
		return list;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/addReservation")
	public void addReservation(@RequestBody Reservation Rsvn)
	{
		service.addReservation(Rsvn);
	   
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateReservation/{id}")
	public void updateReservation(@RequestBody Reservation Rsvn,@PathVariable ("id") Long bookingId)
	{
	   service.updateReservation(Rsvn);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteReservation/{id}")
	public void delete(@PathVariable ("id")  Long bookingId)
	{
		service.delete(bookingId);
	}
	}

