package tn.jmlesous.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Portefeuille implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	 @OneToOne(mappedBy = "portefeuille")
	  private Client client;
	 
	 @OneToMany(mappedBy="portefeuille")
	  private Set<DeriveFinanciere> derives;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<DeriveFinanciere> getDerives() {
		return derives;
	}

	public void setDerives(Set<DeriveFinanciere> derives) {
		this.derives = derives;
	}

}