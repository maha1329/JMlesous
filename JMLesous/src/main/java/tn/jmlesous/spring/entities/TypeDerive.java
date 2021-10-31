package tn.jmlesous.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeDerive implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy="typeDerive")
    private Set<AttributesTypeDerive> attributes;
	
	@OneToMany(mappedBy="typeDerive")
	private Set<DeriveFinanciere> derives;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<AttributesTypeDerive> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<AttributesTypeDerive> attributes) {
		this.attributes = attributes;
	}

	public Set<DeriveFinanciere> getDerives() {
		return derives;
	}

	public void setDerives(Set<DeriveFinanciere> derives) {
		this.derives = derives;
	}

		
	

}
