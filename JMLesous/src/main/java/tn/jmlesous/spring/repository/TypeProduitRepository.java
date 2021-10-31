package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.TypeProduit;

@Repository
public interface TypeProduitRepository extends JpaRepository<TypeProduit, Integer> {

}
