package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.Compte;


@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer> {
}
