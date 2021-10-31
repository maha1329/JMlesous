package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
