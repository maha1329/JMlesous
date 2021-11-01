package com.JMlessous.ebanking.entity;

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

import lombok.Data;

@Entity
@Data
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
