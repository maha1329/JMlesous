package com.JMlessous.ebanking.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Transaction  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private float montant;
	
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	
	private Compte destinatiare;

	@ManyToOne
    @JoinColumn(name="compte_id")
    private Compte compte;
	 
	
	
	


}
