package muneneLotto.domain;

import java.util.Date;

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
	
	private Date dateTicketPurchase;

	@ManyToOne
	@JoinColumn(name = "player_id")
	private Player player;
	
	private String selectedNumbers;
	
	
	//constructor
	public Ticket(Long ticketID, Date dateTicketPurchase, Player player, String selectedNumbers) {
		super();
		TicketID = ticketID;
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

	public Date getDateTicketPurchase() {
		return dateTicketPurchase;
	}

	public void setDateTicketPurchase(Date dateTicketPurchase) {
		this.dateTicketPurchase = dateTicketPurchase;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getSelectedNumbers() {
		return selectedNumbers;
	}

	public void setSelectedNumbers(String selectedNumbers) {
		this.selectedNumbers = selectedNumbers;
	}


}
