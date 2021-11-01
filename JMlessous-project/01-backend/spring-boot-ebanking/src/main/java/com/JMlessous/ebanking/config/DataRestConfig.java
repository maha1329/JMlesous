package com.JMlessous.ebanking.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.JMlessous.ebanking.entity.AttributesTypeCompte;
import com.JMlessous.ebanking.entity.AttributesTypeDerive;
import com.JMlessous.ebanking.entity.AttributesTypeProduit;
import com.JMlessous.ebanking.entity.AttributesTypeProduitPartenaire;
import com.JMlessous.ebanking.entity.Client;
import com.JMlessous.ebanking.entity.Compte;
import com.JMlessous.ebanking.entity.Credit;
import com.JMlessous.ebanking.entity.DeriveFinanciere;
import com.JMlessous.ebanking.entity.Devise;
import com.JMlessous.ebanking.entity.Employe;
import com.JMlessous.ebanking.entity.Partenaire;
import com.JMlessous.ebanking.entity.Portefeuille;
import com.JMlessous.ebanking.entity.Produit;
import com.JMlessous.ebanking.entity.ProduitPartenaire;
import com.JMlessous.ebanking.entity.Transaction;
import com.JMlessous.ebanking.entity.TypeComptes;
import com.JMlessous.ebanking.entity.TypeDerive;
import com.JMlessous.ebanking.entity.TypeProduit;
import com.JMlessous.ebanking.entity.TypeProduitPartenaire;



@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {
	
	private EntityManager entityManager;
	
	@Autowired
	public DataRestConfig(EntityManager theEntityManager) {
		entityManager=theEntityManager;
		
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
		HttpMethod[] theUnsupportedActions= {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
		
		//disable HTTP methods for  Client: PUT , POST, DELETE
		config.getExposureConfiguration()
		.forDomainType(Client.class)
		.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
		
		//disable HTTP methods for Compte: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(Compte.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
			
		//disable HTTP methods for Credit: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(Credit.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for DeriveFinanciere: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(DeriveFinanciere.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for Devise: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(Devise.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for Employe: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(Employe.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for Partenaire: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(Partenaire.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for Portefeuille: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(Portefeuille.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for Produit: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(Produit.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for ProduitPartenaire: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(ProduitPartenaire.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
				
		//disable HTTP methods for Transaction: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(Transaction.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for TypeComptes: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(TypeComptes.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for TypeDerive: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(TypeDerive.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
				
		//disable HTTP methods for TypeProduit: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(TypeProduit.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for TypeProduitPartenaire: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(TypeProduitPartenaire.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for AttributesTypeProduitPartenaire: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(AttributesTypeProduitPartenaire.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for AttributesTypeProduit: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(AttributesTypeProduit.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
		//disable HTTP methods for AttributesTypeDerive: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(AttributesTypeDerive.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
				//disable HTTP methods for AttributesTypeCompte: PUT , POST, DELETE
				config.getExposureConfiguration()
				.forDomainType(AttributesTypeCompte.class)
				.withItemExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata,httpMethods)-> httpMethods.disable(theUnsupportedActions));
				
				
				
				
		//call an internal helper methode to display Ids
		exposeIds(config);		
	}

	private void exposeIds(RepositoryRestConfiguration config) {
		//expose entity ids
		//
		
		//get a list of all entity classes from the entity manager
		Set<EntityType<?>> entities=entityManager.getMetamodel().getEntities();
		
		//create an array of the entity types
		List<Class> entityClasses = new ArrayList<>();
		
		//get the entity types for the entities
		for(EntityType tempEntityType : entities) {
			entityClasses.add(tempEntityType.getJavaType());
		}
		
		//expose the entity ids for the array of entity/domain types
		Class[] domainTypes=entityClasses.toArray(new Class[0] );
		config.exposeIdsFor(domainTypes);
		
	}
		

}
