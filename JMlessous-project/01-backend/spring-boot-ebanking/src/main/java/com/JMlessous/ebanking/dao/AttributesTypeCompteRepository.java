package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.JMlessous.ebanking.entity.AttributesTypeCompte;


@RepositoryRestResource
@CrossOrigin(origins="http://localhost:4200", allowedHeaders ="*")
public interface AttributesTypeCompteRepository extends JpaRepository<AttributesTypeCompte, Integer> {

}


