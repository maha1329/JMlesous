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
public class TypeProduit implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy="typeProduit")
    private Set<AttributesTypeProduit> attributes;
	
	@OneToMany(mappedBy="typeProduit")
    private Set<Produit> type;
	
	
	
}
