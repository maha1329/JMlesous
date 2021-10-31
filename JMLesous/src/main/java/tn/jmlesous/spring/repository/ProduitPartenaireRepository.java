package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.ProduitPartenaire;
@Repository
public interface ProduitPartenaireRepository extends JpaRepository<ProduitPartenaire, Integer> {

}
