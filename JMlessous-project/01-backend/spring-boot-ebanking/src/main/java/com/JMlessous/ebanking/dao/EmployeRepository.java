package com.JMlessous.ebanking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JMlessous.ebanking.entity.Employe;


@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
