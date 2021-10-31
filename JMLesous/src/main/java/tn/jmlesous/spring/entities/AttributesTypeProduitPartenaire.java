package tn.jmlesous.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class AttributesTypeProduitPartenaire implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	private TYPE type;
	
	private float valeur;

	@ManyToOne
    @JoinColumn(name="typeProduitPartenaire_id")
    private TypeProduitPartenaire typeProduitPartenaire;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public float getValeur() {
		return valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}

	public TypeProduitPartenaire getTypeProduitPartenaire() {
		return typeProduitPartenaire;
	}

	public void setTypeProduitPartenaire(TypeProduitPartenaire typeProduitPartenaire) {
		this.typeProduitPartenaire = typeProduitPartenaire;
	}



}