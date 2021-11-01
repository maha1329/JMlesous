package com.JMlessous.ebanking.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class TypeComptes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@OneToMany(mappedBy="typeComptes")
    private Set<AttributesTypeCompte> attributes;
	
	@OneToMany(mappedBy="type")
    private Set<Compte> compte;


	public TypeComptes(int id, Set<AttributesTypeCompte> attributes, Set<Compte> compte) {
		super();
		this.id = id;
		this.attributes = attributes;
		this.compte = compte;
	}

	
	
	
}
