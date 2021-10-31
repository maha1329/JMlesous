package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.AttributesTypeProduitPartenaire;
@Repository
public interface AttributesTypeProduitPartenaireRepository extends JpaRepository<AttributesTypeProduitPartenaire, Integer> {

}
