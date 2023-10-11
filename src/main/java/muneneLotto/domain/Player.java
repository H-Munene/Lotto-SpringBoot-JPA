package muneneLotto.domain;

import java.util.ArrayList;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long playerSystemID;
	
	private  String playerId;
	private  String playerName;
	private  Date dateOfBirth ;
	
	
	public Player(Long playerSystemID, String playerId, String playerName, Date dateOfBirth) {
		super();
		this.playerSystemID = playerSystemID;
		this.playerId = playerId;
		this.playerName = playerName;
		this.dateOfBirth = dateOfBirth;
	}
	
	@OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
	private ArrayList<Ticket> ticketsPurchased;
	
	
	public Long getPlayerSystemID() {
		return playerSystemID;
	}

	public void setPlayerSystemID(Long playerSystemID) {
		this.playerSystemID = playerSystemID;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

}
