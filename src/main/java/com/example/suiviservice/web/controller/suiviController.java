package com.microservice.suiviservice.web.controller;

import com.microservice.suiviservice.dao.SuiviDao;
import com.microservice.suiviservice.model.Suivi;
import com.microservice.suiviservice.web.exceptions.SuiviIntrouvableException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.List;

@RestController
@Api(value = "API pour les opérations sur les suivi")
public class SuiviController {

    private static final Logger logger = LoggerFactory.getLogger(SuiviController.class);
    @Autowired
    private SuiviDao suiviDao;
    @Autowired
    private HttpServletRequest requestContext;

    @ApiOperation(value = "Récupère la liste des suivis !")
    @GetMapping(value = "/Suivis")
    public List<Suivi> listeSuivis() {
        logger.info("Début d'appel au service Suivis pour la requête : " + requestContext.getHeader("req-id"));
        return suiviDao.findAll();
    }

    //Récupérer un suivi de commande par son Id
    @ApiOperation(value = "Récupère un suivi de commande grâce à son ID à condition que celui-ci existe !")
    @GetMapping(value = "/Suivis/{id}")
    public Suivi afficherUnSuivi(@PathVariable int id) {
        logger.info("Début d'appel au service Suivis pour la requête : " + requestContext.getHeader("req-id"));
        return suiviDao.findById(id).orElseThrow(() -> new SuiviIntrouvableException("Le suivi avec l'id " + id + " est INTROUVABLE"));
    }

    //créer un suivi de commande
    @ApiOperation(value = "Permet d'initialiser un suivi !")
    @PostMapping(value = "/Suivis")
    public ResponseEntity<Void> creerSuivi(@RequestBody Suivi suivi) {
        logger.info("Début d'appel au service Suivis pour la requête : " + requestContext.getHeader("req-id"));
        Suivi suiviAdded = suiviDao.save(suivi);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(suiviAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    //définir l'état d'un suivi de commande
    @ApiOperation(value = "Permet de définir l'état d'un suivi de commande !")
    @PostMapping(value = "/Suivis/{id}/etat")
    public ResponseEntity<Void> setEtatSuivi(@PathVariable int id, @RequestBody String etat) {
        logger.info("Début d'appel au service Suivis pour la requête : " + requestContext.getHeader("req-id"));
        
        // TODO

    }

}
