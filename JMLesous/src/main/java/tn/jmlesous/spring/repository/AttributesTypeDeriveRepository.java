package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.AttributesTypeDerive;

@Repository
public interface AttributesTypeDeriveRepository extends JpaRepository<AttributesTypeDerive, Integer> {

}
