package muneneLotto.bootstrap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import muneneLotto.domain.Player;
import muneneLotto.domain.Ticket;
import muneneLotto.repositories.PlayerRepository;
import muneneLotto.repositories.TicketRepository;
import muneneLotto.services.PlayerService;

@Component
public class BootstrapData  implements CommandLineRunner{


	private PlayerService playerService;
	private PlayerRepository playerRepository;
	private TicketRepository ticketRepository;
	
	
	public BootstrapData(PlayerService playerService, PlayerRepository playerRepository, TicketRepository ticketRepository) {
		super();
		this.playerService = playerService;
		this.playerRepository = playerRepository;
		this.ticketRepository = ticketRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Player player = new Player();
		player.setDateOfBirth(LocalDate.of(2003, 03, 16));
		player.setNationalId(40068339L);
		player.setPlayerName("Hezekiah Munene");
		
		
		Player playerSaved = playerRepository.save(player);
		Ticket ticketSaved = ticketRepository.save(new Ticket((LocalDateTime.now()).truncatedTo(ChronoUnit.SECONDS), "1,2,3,4,5,6", player));
		Ticket ticketSaved2 = ticketRepository.save(new Ticket((LocalDateTime.now()).truncatedTo(ChronoUnit.SECONDS), "2,3,4,5,6,7", player));
		
		playerRepository.save(playerSaved);
		ticketRepository.save(ticketSaved);
		ticketRepository.save(ticketSaved2);
		
		System.out.println("In Player repository...");
		System.out.println(playerRepository.count());
		System.out.println("In Ticket repository...");
		System.out.println(ticketRepository.count());

		System.out.println("Player id 1 ticket(s) are: ");
		System.out.println(playerService.getPlayerTickets(1L));	
	
	} 

}
