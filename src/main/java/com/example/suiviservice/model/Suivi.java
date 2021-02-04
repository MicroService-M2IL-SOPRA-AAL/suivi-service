package com.microservice.commandesservice.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Suivi {
    @Id
//    @GeneratedValue
    private int id;
    private int idCommande;
    private Etat etat; 

    public Suivi(int id, int idCommande, Etat etat) {
        this.id = id;
        this.idCommande = idCommande;
        this.etat = etat;
    }

    public Suivi() {
    }

    public int getId() {
        return id;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }


    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", etat=" + etat +
                ", prix=" + prix +
                '}';
    }
}
