package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bindings.Passenger;
import com.example.demo.Bindings.Ticket;
import com.example.demo.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@PostMapping(value="/ticket", produces="application/json", consumes = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger p)
	{
		Ticket ticket=ticketService.bookTicket(p);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/ticket/{tid}",produces = "application/json")
	public ResponseEntity<Ticket> getTicket(@PathVariable("tid")Integer tid)
	{
		Ticket ticket=ticketService.getTicket(tid);
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}
	
	@GetMapping(value="/tickets")
	public ResponseEntity<List<Ticket>> AllTickets()
	{
		List<Ticket> tickets=ticketService.getTickets();
		System.out.println("printing :  "+tickets);
		return new ResponseEntity<>(tickets, HttpStatus.OK);
		
	}
}
