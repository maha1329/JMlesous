package tn.jmlesous.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeProduitPartenaire implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy="typeProduitPartenaire")
    private Set<AttributesTypeProduitPartenaire> attributes;
	
	@OneToMany(mappedBy="typeProduitPartenaire")
    private Set<ProduitPartenaire> produitPartenaire;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<AttributesTypeProduitPartenaire> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<AttributesTypeProduitPartenaire> attributes) {
		this.attributes = attributes;
	}

	public Set<ProduitPartenaire> getProduitPartenaire() {
		return produitPartenaire;
	}

	public void setProduitPartenaire(Set<ProduitPartenaire> produitPartenaire) {
		this.produitPartenaire = produitPartenaire;
	}


	
}
