package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.AttributesTypeCompte;

@Repository
public interface AttributesTypeCompteRepository extends JpaRepository<AttributesTypeCompte, Integer> {

}


