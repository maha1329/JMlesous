package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.TypeDerive;



@Repository
public interface TypeDeriveRepository extends JpaRepository<TypeDerive, Integer> {

}
