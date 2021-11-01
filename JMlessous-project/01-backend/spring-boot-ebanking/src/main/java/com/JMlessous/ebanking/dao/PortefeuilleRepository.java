package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.Portefeuille;


@Repository
public interface PortefeuilleRepository extends JpaRepository<Portefeuille, Integer> {

}
