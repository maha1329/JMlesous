package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.TypeComptes;


@Repository
public interface TypeComptesRepository extends JpaRepository<TypeComptes, Integer> {

}
