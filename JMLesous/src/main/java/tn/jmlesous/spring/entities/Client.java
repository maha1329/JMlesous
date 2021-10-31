package tn.jmlesous.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String login;

	private String password;
	
	private String secondMdp;
	
	private int etatMdp;
	
	private String nom;
	
	private int etatProfil;
	
    private int nbFailedConnection;
    
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	private String adresse;
	
	private String telephone;
	
	private String travail;
	
	private int basicNumber;

	
	@OneToMany(mappedBy="client")
    private Set<Compte> comptes;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "portefeuille_id", referencedColumnName = "id")
    private Portefeuille portefeuille;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecondMdp() {
		return secondMdp;
	}

	public void setSecondMdp(String secondMdp) {
		this.secondMdp = secondMdp;
	}

	public int getEtatMdp() {
		return etatMdp;
	}

	public void setEtatMdp(int etatMdp) {
		this.etatMdp = etatMdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEtatProfil() {
		return etatProfil;
	}

	public void setEtatProfil(int etatProfil) {
		this.etatProfil = etatProfil;
	}

	public int getNbFailedConnection() {
		return nbFailedConnection;
	}

	public void setNbFailedConnection(int nbFailedConnection) {
		this.nbFailedConnection = nbFailedConnection;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTravail() {
		return travail;
	}

	public void setTravail(String travail) {
		this.travail = travail;
	}

	public int getBasicNumber() {
		return basicNumber;
	}

	public void setBasicNumber(int basicNumber) {
		this.basicNumber = basicNumber;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Set<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	public Portefeuille getPortefeuille() {
		return portefeuille;
	}

	public void setPortefeuille(Portefeuille portefeuille) {
		this.portefeuille = portefeuille;
	}
	
	

}