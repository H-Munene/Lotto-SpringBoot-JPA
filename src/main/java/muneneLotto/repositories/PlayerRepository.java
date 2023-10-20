package muneneLotto.repositories;

import org.springframework.data.repository.CrudRepository;

import muneneLotto.domain.Player;

public interface PlayerRepository extends CrudRepository<Player, Long>{
	
}
