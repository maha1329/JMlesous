package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.TypeProduit;


@Repository
public interface TypeProduitRepository extends JpaRepository<TypeProduit, Integer> {

}
