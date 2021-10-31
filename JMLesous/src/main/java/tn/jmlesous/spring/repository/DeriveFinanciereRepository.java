package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.DeriveFinanciere;

@Repository
public interface DeriveFinanciereRepository extends JpaRepository<DeriveFinanciere, Integer> {

}
