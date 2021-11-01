package com.JMlessous.ebanking.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Portefeuille implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	 @OneToOne(mappedBy = "portefeuille")
	  private Client client;
	 
	 @OneToMany(mappedBy="portefeuille")
	  private Set<DeriveFinanciere> derives;

}