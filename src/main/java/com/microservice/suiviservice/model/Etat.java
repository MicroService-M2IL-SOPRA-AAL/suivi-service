package com.microservice.suiviservice.model;

public enum Etat {
    NONE("Non défini"),
    EXP("Expédiée"),
    PREP("En cours de préparation"),
    WAIT("En attente de paiement");

    public final String etat;

    Etat(String s) {
        etat = s;
    }
}