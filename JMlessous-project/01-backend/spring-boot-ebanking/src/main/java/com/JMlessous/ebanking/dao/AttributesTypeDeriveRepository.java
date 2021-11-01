package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.AttributesTypeDerive;

@Repository
public interface AttributesTypeDeriveRepository extends JpaRepository<AttributesTypeDerive, Integer> {

}
