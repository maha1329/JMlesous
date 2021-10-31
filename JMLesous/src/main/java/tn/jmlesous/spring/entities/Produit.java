package tn.jmlesous.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Produit implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
    @JoinColumn(name="typeProduit_id")
	private TypeProduit typeProduit;

	@ManyToMany
	Set<Employe> traiteurs;
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public TypeProduit getTypeProduit() {
		return typeProduit;
	}

	public void setTypeProduit(TypeProduit typeProduit) {
		this.typeProduit = typeProduit;
	}

	public Set<Employe> getTraiteurs() {
		return traiteurs;
	}

	public void setTraiteurs(Set<Employe> traiteurs) {
		this.traiteurs = traiteurs;
	}
	


}