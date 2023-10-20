package muneneLotto.services;

import java.util.Optional;

import muneneLotto.domain.Ticket;

public interface TicketService {
	
	Optional<Ticket> getPlayerTicket(Long playerId);
	public void createTicket(Ticket ticket);
	
	public Iterable<Ticket> getAllTickets();
	
}
