package muneneLotto.repositories;

import org.springframework.data.repository.CrudRepository;

import muneneLotto.domain.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long>{

}
