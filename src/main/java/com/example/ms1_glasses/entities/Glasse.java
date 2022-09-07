package com.example.ms1_glasses.entities;


import lombok.Data;


import javax.persistence.*;

@Entity
@Data
public class Glasse {
    @Id
    private  String id;
    private boolean isSolaire ;
    private int qte_stck;
    private double weight;
    private String idMonture;

    private String idPershase;
    private String idVerre;
    private String id_sales;
    @Transient
    private Monture monture;
    @Transient
    private Sales sales;
    @Transient
    Verre verre;
    @Transient
    Perchase perchase;

    @ManyToOne
   // @JoinColumn(referencedColumnName = "idCat")
    private Categorie categorie;


    public Glasse(String id, boolean isSolaire, int qte_stck, double weight,
                  String idMonture, String idPershase, String idVerre, String id_sales,
                  Monture monture, Sales sales, Verre verre, Perchase perchase, Categorie categorie) {
        this.id = id;
        this.isSolaire = isSolaire;
        this.qte_stck = qte_stck;
        this.weight = weight;
        this.idMonture = idMonture;
        this.idPershase = idPershase;
        this.idVerre = idVerre;
        this.id_sales = id_sales;
        this.monture = monture;
        this.sales = sales;
        this.verre = verre;
        this.perchase = perchase;
        this.categorie = categorie;
    }

    public Verre getVerre() {
        return verre;
    }

    public void setVerre(Verre verre) {
        this.verre = verre;
    }

    public Monture getMonture() {
        return monture;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Perchase getPerchase() {
        return perchase;
    }

    public void setPerchase(Perchase perchase) {
        this.perchase = perchase;
    }

    public String getIdPershase() {
        return idPershase;
    }

    public void setIdPershase(String idPershase) {
        this.idPershase = idPershase;
    }

    public String getIdVerre() {
        return idVerre;
    }

    public void setIdVerre(String idVerre) {
        this.idVerre = idVerre;
    }

    public String getId_sales() {
        return id_sales;
    }

    public void setId_sales(String id_sales) {
        this.id_sales = id_sales;
    }

    public Monture getMonture(String idMonture) {
        return monture;
    }

    public void setMonture(Monture monture) {
        this.monture = monture;
    }

    public String getIdMonture() {
        return idMonture;
    }

    public void setIdMonture(String idMonture) {
        this.idMonture = idMonture;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Glasse() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isSolaire() {
        return isSolaire;
    }

    public void setSolaire(boolean solaire) {
        isSolaire = solaire;
    }

    public int getQte_stck() {
        return qte_stck;
    }

    public void setQte_stck(int qte_stck) {
        this.qte_stck = qte_stck;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }




}
