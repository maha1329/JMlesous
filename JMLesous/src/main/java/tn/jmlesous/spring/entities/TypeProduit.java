package tn.jmlesous.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeProduit implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy="typeProduit")
    private Set<AttributesTypeProduit> attributes;
	
	@OneToMany(mappedBy="typeProduit")
    private Set<Produit> type;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<AttributesTypeProduit> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<AttributesTypeProduit> attributes) {
		this.attributes = attributes;
	}

	public Set<Produit> getType() {
		return type;
	}

	public void setType(Set<Produit> type) {
		this.type = type;
	}



	
	
}
