package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.Devise;


@Repository
public interface DeviseRepository extends JpaRepository<Devise, Integer> {

}
	