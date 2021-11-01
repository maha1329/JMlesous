package com.JMlessous.ebanking.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class AttributesTypeDerive implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	private TYPE type;
	
	private float valeur;

	@ManyToOne
    @JoinColumn(name="typeDerive_id")
    private TypeDerive typeDerive;
	
	


}