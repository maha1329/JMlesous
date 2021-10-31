package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.Credit;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Integer> {

}
