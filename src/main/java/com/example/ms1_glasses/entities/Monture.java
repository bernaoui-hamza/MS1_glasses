package com.example.ms1_glasses.entities;



public class Monture {
    String idMonture;
    String nom;
    String couleur;
    String paysOrigin;


    public Monture(String id, String nom, String couleur, String paysOrigin) {
        this.idMonture = id;
        this.nom = nom;
        this.couleur = couleur;
        this.paysOrigin = paysOrigin;
    }

    public String getIdMonture() {
        return idMonture;
    }

    public void setIdMonture(String id) {
        this.idMonture = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getPaysOrigin() {
        return paysOrigin;
    }

    public void setPaysOrigin(String paysOrigin) {
        this.paysOrigin = paysOrigin;
    }
}
