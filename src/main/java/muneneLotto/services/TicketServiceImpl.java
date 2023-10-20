package muneneLotto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import muneneLotto.domain.Ticket;
import muneneLotto.repositories.TicketRepository;


@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public Optional<Ticket> getPlayerTicket(Long playerId) {
		
		return ticketRepository.findById(playerId);
	}

	@Override
	public void createTicket(Ticket ticket) {
		ticketRepository.save(ticket);
	}

	@Override
	public Iterable<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll();
	}
}
