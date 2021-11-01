package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.Compte;



@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer> {
}
