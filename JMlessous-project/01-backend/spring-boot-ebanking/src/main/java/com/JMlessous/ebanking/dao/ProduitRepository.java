package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.Produit;


@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
