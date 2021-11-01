package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.AttributesTypeCompte;


@Repository
public interface AttributesTypeCompteRepository extends JpaRepository<AttributesTypeCompte, Integer> {

}


