package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.AttributesTypeProduit;

@Repository
public interface AttributesTypeProduitRepository extends JpaRepository<AttributesTypeProduit, Integer> {

}


