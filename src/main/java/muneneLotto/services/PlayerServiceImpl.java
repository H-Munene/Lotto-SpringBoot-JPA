package muneneLotto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import muneneLotto.domain.Player;
import muneneLotto.domain.Ticket;
import muneneLotto.repositories.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public void addNewPlayer(Player player) {
		
		playerRepository.save(player);
		
	}

	@Override
	public Iterable<Player> getAllPlayers() {
		
		return playerRepository.findAll();
	}

	@Override
	public Optional<Player> getPlayerById(Long player_id) {
		
		return playerRepository.findById(player_id);
	}

	@Override
	public List<Ticket> getPlayerTickets(Long player_id) {
		
		Optional<Player> player = playerRepository.findById(player_id);
		
		if(player.isPresent()) {
			return player.get().getTicket();
		}
		
		return null;
	}

}
