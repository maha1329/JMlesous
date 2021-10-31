package tn.jmlesous.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.jmlesous.spring.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
