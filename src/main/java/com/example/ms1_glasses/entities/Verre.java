package com.example.ms1_glasses.entities;

public class Verre {
    String idVerre;
    String nom;
    String paysOrigin;

    public Verre() {
    }

    public Verre(String idVerre, String nom, String paysOrigin) {
        this.idVerre = idVerre;
        this.nom = nom;
        this.paysOrigin = paysOrigin;
    }

    public String getIdVerre() {
        return idVerre;
    }

    public void setIdVerre(String idVerre) {
        this.idVerre = idVerre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPaysOrigin() {
        return paysOrigin;
    }

    public void setPaysOrigin(String paysOrigin) {
        this.paysOrigin = paysOrigin;
    }
}
