package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.AttributesTypeProduit;


@Repository
public interface AttributesTypeProduitRepository extends JpaRepository<AttributesTypeProduit, Integer> {

}


