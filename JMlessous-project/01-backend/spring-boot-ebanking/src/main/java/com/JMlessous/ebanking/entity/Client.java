package com.JMlessous.ebanking.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String login;

	private String password;
	
	private String secondMdp;
	
	private int etatMdp;
	
	private String nom;
	
	private int etatProfil;
	
    private int nbFailedConnection;
    
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	private String adresse;
	
	private String telephone;
	
	private String travail;
	
	private int basicNumber;

	
	@OneToMany(mappedBy="client")
    private Set<Compte> comptes;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "portefeuille_id", referencedColumnName = "id")
    private Portefeuille portefeuille;
		
	

}