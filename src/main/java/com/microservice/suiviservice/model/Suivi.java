package com.microservice.suiviservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Suivi {
    @Id
//    @GeneratedValue
    private int id;
    private Etat etat;

    public Suivi(int id, Etat etat) {
        this.id = id;
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
                ", etat=" + etat +
                '}';
    }
}
