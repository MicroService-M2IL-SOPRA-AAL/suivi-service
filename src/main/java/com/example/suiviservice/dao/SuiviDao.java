package com.microservice.suiviservice.dao;

import com.microservice.suiviservice.model.Suivi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuiviDao extends JpaRepository<Suivi, Integer> {

    List<Suivi> findAllByOrderByNom();

}
