package muneneLotto.domain;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long TicketID;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = Shape.STRING)
	private LocalDateTime dateTicketPurchase;

	@ManyToOne
	@JoinColumn(name = "player_id")
	private Player player;
	
	private String selectedNumbers;
	
	public Ticket() {
		
	}
	
	//constructor
	public Ticket(LocalDateTime dateTicketPurchase, String selectedNumbers, Player player) {
		super();
		this.dateTicketPurchase = dateTicketPurchase;
		this.player = player;
		this.selectedNumbers = selectedNumbers;
	}

	//getters setters
	public Long getTicketID() {
		return TicketID;
	}

	public void setTicketID(Long ticketID) {
		TicketID = ticketID;
	}

	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public LocalDateTime getDateTicketPurchase() {
		return dateTicketPurchase;
	}

	public void setDateTicketPurchase(LocalDateTime dateTicketPurchase) {
		this.dateTicketPurchase = dateTicketPurchase;
	}

	public String getSelectedNumbers() {
		return selectedNumbers;
	}

	public void setSelectedNumbers(String selectedNumbers) {
		this.selectedNumbers = selectedNumbers;
	}


	@Override
	public String toString() {
		return "Ticket [TicketID=" + TicketID + ", dateTicketPurchase=" + dateTicketPurchase + ", selectedNumbers="
				+ selectedNumbers + "]";
	}
	
}
