package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
