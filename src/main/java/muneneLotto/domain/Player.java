package muneneLotto.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long playerId;
	private  Long nationalId;
	
	private  String playerName;
	
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	private  LocalDate dateOfBirth ;
	
	
	public Player() {
		
	}
	
	public Player(Long playerId, Long nationalId,String playerName, LocalDate dateOfBirth) {
		super();
	
		this.nationalId = nationalId;
		this.playerId = playerId;
		this.playerName = playerName;
		this.dateOfBirth = dateOfBirth;
	}
		
	@OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Ticket> ticket;
	
	
	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	
	public Long getNationalId() {
		return nationalId;
	}

	public void setNationalId(Long nationalId) {
		this.nationalId = nationalId;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" 
				+ playerName + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
