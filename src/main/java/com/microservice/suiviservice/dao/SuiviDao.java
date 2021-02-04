package com.microservice.suiviservice.dao;

import com.microservice.suiviservice.model.Suivi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuiviDao extends JpaRepository<Suivi, Integer> {
}
