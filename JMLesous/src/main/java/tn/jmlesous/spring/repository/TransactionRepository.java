package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
