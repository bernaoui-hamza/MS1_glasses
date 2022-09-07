package com.example.ms1_glasses.Dto;

import com.example.ms1_glasses.entities.*;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


@Data
public class GlasseResponseDto {
    String id;
    boolean isSolaire ;
    int qte_stck;
    double weight;
    CategorieDto categorie;

    Sales sales;
  Monture monture;
    Verre verre;
  Perchase perchase;

    //☺ya salaam

    public GlasseResponseDto() {
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Verre getVerre() {
        return verre;
    }

    public void setVerre(Verre verre) {
        this.verre = verre;
    }

    public Perchase getPerchase() {
        return perchase;
    }

    public void setPerchase(Perchase perchase) {
        this.perchase = perchase;
    }

    public Monture getMonture() {
        return monture;
    }

    public void setMonture(Monture monture) {
        this.monture=monture;
    }

    public CategorieDto getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieDto categorie) {
        this.categorie = categorie;
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

    public GlasseResponseDto(String id, boolean isSolaire, int qte_stck, double weight,
                             CategorieDto categorie, Sales sales, Monture monture, Verre verre, Perchase perchase) {
        this.id = id;
        this.isSolaire = isSolaire;
        this.qte_stck = qte_stck;
        this.weight = weight;
        this.categorie = categorie;
        this.sales = sales;
        this.monture = monture;
        this.verre = verre;
        this.perchase = perchase;
    }
}
