package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.ProduitPartenaire;

@Repository
public interface ProduitPartenaireRepository extends JpaRepository<ProduitPartenaire, Integer> {

}
