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
	 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public TypeProduitPartenaire getTypeProduitPartenaire() {
		return typeProduitPartenaire;
	}


	public void setTypeProduitPartenaire(TypeProduitPartenaire typeProduitPartenaire) {
		this.typeProduitPartenaire = typeProduitPartenaire;
	}


	public Partenaire getPartenaire() {
		return partenaire;
	}


	public void setPartenaire(Partenaire partenaire) {
		this.partenaire = partenaire;
	}


	public Set<Employe> getTraiteurs() {
		return traiteurs;
	}


	public void setTraiteurs(Set<Employe> traiteurs) {
		this.traiteurs = traiteurs;
	}



	

}