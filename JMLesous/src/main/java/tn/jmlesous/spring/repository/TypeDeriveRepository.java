package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.TypeDerive;


@Repository
public interface TypeDeriveRepository extends JpaRepository<TypeDerive, Integer> {

}
