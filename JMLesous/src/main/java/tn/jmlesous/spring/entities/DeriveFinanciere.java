package tn.jmlesous.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DeriveFinanciere implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

 
	@ManyToOne
    @JoinColumn(name="type_derive_id")
	private TypeDerive typeDerive;

    @ManyToOne
    @JoinColumn(name="portfeuille_id")
    private Portefeuille portefeuille;


    
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public TypeDerive getTypeDerive() {
		return typeDerive;
	}


	public void setTypeDerive(TypeDerive typeDerive) {
		this.typeDerive = typeDerive;
	}


	public Portefeuille getPortefeuille() {
		return portefeuille;
	}


	public void setPortefeuille(Portefeuille portefeuille) {
		this.portefeuille = portefeuille;
	}
	
	

}