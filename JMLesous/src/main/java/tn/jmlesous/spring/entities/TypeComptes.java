package tn.jmlesous.spring.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeComptes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@OneToMany(mappedBy="typeComptes")
    private Set<AttributesTypeCompte> attributes;
	
	@OneToMany(mappedBy="type")
    private Set<Compte> compte;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<AttributesTypeCompte> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<AttributesTypeCompte> attributes) {
		this.attributes = attributes;
	}

	public Set<Compte> getCompte() {
		return compte;
	}

	public void setCompte(Set<Compte> compte) {
		this.compte = compte;
	}

	public TypeComptes(int id, Set<AttributesTypeCompte> attributes, Set<Compte> compte) {
		super();
		this.id = id;
		this.attributes = attributes;
		this.compte = compte;
	}

	
	
	
}
