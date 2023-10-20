package muneneLotto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import muneneLotto.domain.Ticket;
import muneneLotto.services.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService ticketService;

	//create a ticket
	@PostMapping("/tickets/createticket")
	public String createTicket(@RequestBody Ticket ticket) {
		
		ticketService.createTicket(ticket);
		
		return "ticket created successfully";
	}
	
	@GetMapping("/tickets/getAll")
	public Iterable<Ticket> getAllTickets() {
		
		return ticketService.getAllTickets();
	}
}