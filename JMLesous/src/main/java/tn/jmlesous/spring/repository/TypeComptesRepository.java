package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.TypeComptes;

@Repository
public interface TypeComptesRepository extends JpaRepository<TypeComptes, Integer> {

}
