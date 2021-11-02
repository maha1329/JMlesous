package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.JMlessous.ebanking.entity.Partenaire;

@RepositoryRestResource
@CrossOrigin(origins="http://localhost:4200", allowedHeaders ="*")
public interface PartenaireRepository extends JpaRepository<Partenaire, Integer> {

}
