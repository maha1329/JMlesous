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
public class DeriveFinanciere implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

 
	@ManyToOne
    @JoinColumn(name="type_derive_id")
	private TypeDerive typeDerive;

    @ManyToOne
    @JoinColumn(name="portfeuille_id")
    private Portefeuille portefeuille;


}