package com.microservice.suiviservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

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

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Suivi{" +
                "id=" + id +
                ", idCommande=" + idCommande +
                ", etat=" + etat +
                '}';
    }
}
