package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}