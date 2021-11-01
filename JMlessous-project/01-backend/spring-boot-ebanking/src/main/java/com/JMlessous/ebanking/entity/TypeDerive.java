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
public class TypeDerive implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy="typeDerive")
    private Set<AttributesTypeDerive> attributes;
	
	@OneToMany(mappedBy="typeDerive")
	private Set<DeriveFinanciere> derives;

	
	

}
