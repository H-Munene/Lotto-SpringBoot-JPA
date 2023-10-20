package muneneLotto.services;

import java.util.List;
import java.util.Optional;

import muneneLotto.domain.Player;
import muneneLotto.domain.Ticket;

public interface PlayerService {
	
	public void addNewPlayer(Player player);
	public Iterable<Player> getAllPlayers();
	public Optional<Player> getPlayerById(Long player_id);
	public List<Ticket> getPlayerTickets(Long player_id);
}
