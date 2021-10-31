package tn.jmlesous.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Compte implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private float solde;

	@ManyToOne
    @JoinColumn(name="devise_id")
	private Devise devise;

	@Temporal(TemporalType.DATE)
	private Date dateCreation;

	private String status;

	private String rib;

	private String iban;

	@OneToMany(mappedBy="compte")
    private Set<Credit> credits;
	
	@OneToMany(mappedBy="compte")
    private Set<Transaction> transactions;
	
	@ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
	
	@ManyToMany
    Set<Employe> traiteur;
	
	@ManyToOne
    @JoinColumn(name="typeCompte_id")
	private TypeComptes type;
	
	
	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	

	public TypeComptes getType() {
		return type;
	}

	public void setType(TypeComptes type) {
		this.type = type;
	}

	public Devise getDevise() {
		return devise;
	}

	public void setDevise(Devise devise) {
		this.devise = devise;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Set<Credit> getCredits() {
		return credits;
	}

	public void setCredits(Set<Credit> credits) {
		this.credits = credits;
	}

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Employe> getTraiteur() {
		return traiteur;
	}

	public void setTraiteur(Set<Employe> traiteur) {
		this.traiteur = traiteur;
	}

	public Compte(int id, float solde, Devise devise, Date dateCreation, String status, String rib, String iban,
			Set<Credit> credits, Set<Transaction> transactions, Client client, Set<Employe> traiteur,
			TypeComptes type) {
		super();
		this.id = id;
		this.solde = solde;
		this.devise = devise;
		this.dateCreation = dateCreation;
		this.status = status;
		this.rib = rib;
		this.iban = iban;
		this.credits = credits;
		this.transactions = transactions;
		this.client = client;
		this.traiteur = traiteur;
		this.type = type;
	}

	
}
