package com.example.demo.service;

import java.util.List;

import com.example.demo.Bindings.Passenger;
import com.example.demo.Bindings.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger p);
	
	public Ticket getTicket(Integer ticketId);
	
	public List<Ticket> getTickets();
	
	
}
