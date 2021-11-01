package com.JMlessous.ebanking.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Employe implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String matricule;
	
	private String login;

	private String password;
	
	private String secondMdp;
	
	private int etatMdp;
	
	private String nom;
	
	private int etatProfil;
	
    private int nbFailedConnection;
    
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	
	private String adresse;
	
	private String telephone;
	
	private String poste;
	
	private float salaire;
	
	private int basicNumber;

	@ManyToMany
    Set<Produit> produitGerer;
	
	@ManyToMany
    Set<ProduitPartenaire> produitPartGerer;
	
	@ManyToMany
    Set<Compte> compte;
		
}