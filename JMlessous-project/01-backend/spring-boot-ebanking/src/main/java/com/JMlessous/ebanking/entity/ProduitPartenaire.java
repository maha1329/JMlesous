package com.JMlessous.ebanking.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class ProduitPartenaire implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	@ManyToOne
    @JoinColumn(name="type_id", nullable=false)
    private TypeProduitPartenaire typeProduitPartenaire;
	
	@ManyToOne
    @JoinColumn(name="partenaire_id", nullable=false)
    private Partenaire partenaire;
	
	@ManyToMany
	Set<Employe> traiteurs;
	 
	
}