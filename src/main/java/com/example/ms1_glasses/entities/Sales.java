package com.example.ms1_glasses.entities;

public class Sales {

    String id;
    String nom_sales;
    int qte;

    public Sales(String id_sales, String nom_sales, int qte) {
        this.id= id_sales;
        this.nom_sales = nom_sales;
        this.qte = qte;
    }

    public String getId() {
        return id;
    }

    public void setId(String id_sales) {
        this.id = id_sales;
    }

    public String getNom_sales() {
        return nom_sales;
    }

    public void setNom_sales(String nom_sales) {
        this.nom_sales = nom_sales;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}
