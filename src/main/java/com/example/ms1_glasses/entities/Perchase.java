package com.example.ms1_glasses.entities;

public class Perchase {
    String idPershase;
    String nom_pershase;
    int qte;
    Fournisseur fournisseur;

    public Perchase(String idPershase, String nom_pershase, int qte, Fournisseur fournisseur) {
        this.idPershase = idPershase;
        this.nom_pershase = nom_pershase;
        this.qte = qte;
        this.fournisseur = fournisseur;
    }

    public Perchase() {
    }

    @Override
    public String toString() {
        return "Perchase{" +
                "idPershase='" + idPershase + '\'' +
                ", nom_pershase='" + nom_pershase + '\'' +
                ", qte=" + qte +
                ", fournisseur=" + fournisseur +
                '}';
    }

    public String getIdPershase() {
        return idPershase;
    }

    public void setIdPershase(String idPershase) {
        this.idPershase = idPershase;
    }

    public String getNom_pershase() {
        return nom_pershase;
    }

    public void setNom_pershase(String nom_pershase) {
        this.nom_pershase = nom_pershase;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
}
