package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.Portefeuille;

@Repository
public interface PortefeuilleRepository extends JpaRepository<Portefeuille, Integer> {

}
