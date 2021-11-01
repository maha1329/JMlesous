package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.AttributesTypeProduitPartenaire;
@Repository
public interface AttributesTypeProduitPartenaireRepository extends JpaRepository<AttributesTypeProduitPartenaire, Integer> {

}
