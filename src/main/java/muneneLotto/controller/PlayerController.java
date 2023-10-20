package muneneLotto.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import muneneLotto.domain.Player;
import muneneLotto.domain.Ticket;
import muneneLotto.services.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;

	
	@PostMapping("/players/addnewplayer")
	public String addnewPlayer(@RequestBody Player player) {
		
		playerService.addNewPlayer(player);
		return "Player added successfully";
	}
	
	@GetMapping(value = "/players")
	public Iterable<Player> getAllPlayers() {
		
		return playerService.getAllPlayers();
	}
	
	@GetMapping("/players/{player_id}/tickets")
	public List<Ticket> getPlayerTicket(@PathVariable Long player_id){
		
		return playerService.getPlayerTickets(player_id);
	}
}

