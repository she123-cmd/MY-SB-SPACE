package com.example.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bindings.Passenger;
import com.example.demo.Bindings.Ticket;
import com.example.demo.Repo.TicketRepo;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepo ticketRepo;
	@Override
	public Ticket bookTicket(Passenger p) {
		
		Ticket t=new Ticket();
		BeanUtils.copyProperties(p, t);
		t.setTicketStatus("confirmed");
		Ticket savedTicket=ticketRepo.save(t);
		return savedTicket;
	}

	@Override
	public Ticket getTicket(Integer ticketId) {
		    Ticket ticket=ticketRepo.findById(ticketId).orElseThrow();
		return ticket;
	}

	@Override
	public List<Ticket> getTickets() {
		return ticketRepo.findAll();
		
	}

}
