package CDG.GestionEvent.model;



import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "groupe")
public class Groupe {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "groupe_id")
	private Long id;
	
	@Column(name = "Nom")
	private String nom;
	
	private String Client;
	
	private int QTe ;
	
	private String Date;
	
	
	
	
	

	




	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "CMD_PROD", joinColumns = @JoinColumn(name = "groupe_id"), inverseJoinColumns = @JoinColumn(name = "event_id"))
    private Set<Event> events=new HashSet<>();
	
	

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	public Groupe() {
		super();
	}

	public Groupe(String nom) {
		super();
		this.nom = nom;
	}

	
	
	

	public void addEvent(Event event) {
		this.events.add(event);
		
	}

	public String getClient() {
		return Client;
	}

	public void setClient(String client) {
		Client = client;
	}

	


	public void addCMD(Event event) {
		this.events.add(event);}
	
	public void removeCMD(Event event) {
		this.events.remove(event);}


	/**
	 * @return the qTe
	 */
	public int getQTe() {
		return QTe;
	}

	/**
	 * @param qTe the qTe to set
	 */
	public void setQTe(int qTe) {
		QTe = qTe;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return Date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		Date = date;
	}
		
	
	
}
