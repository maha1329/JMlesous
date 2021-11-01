package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.DeriveFinanciere;


@Repository
public interface DeriveFinanciereRepository extends JpaRepository<DeriveFinanciere, Integer> {

}
