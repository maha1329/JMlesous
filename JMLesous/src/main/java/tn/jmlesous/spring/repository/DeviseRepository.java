package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.Devise;

@Repository
public interface DeviseRepository extends JpaRepository<Devise, Integer> {

}
