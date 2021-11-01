package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
