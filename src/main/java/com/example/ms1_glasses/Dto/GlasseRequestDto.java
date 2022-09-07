package com.example.ms1_glasses.Dto;

import com.example.ms1_glasses.entities.Categorie;
import com.example.ms1_glasses.entities.Monture;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class GlasseRequestDto {
String id;
    boolean isSolaire ;
    int qte_stck;
    double weight;
    CategorieDto categorie;
    String idMonture;
    String id_sales;
    String idVerre;
    String idPershase;

    //☺ya salaam



    @Override
    public String toString() {
        return "GlasseRequestDto{" +
                "id='" + id + '\'' +
                ", isSolaire=" + isSolaire +
                ", qte_stck=" + qte_stck +
                ", weight=" + weight +
                ", categorie=" + categorie +
                ", idMonture='" + idMonture + '\'' +"id_sales"+idMonture+
                '}';
    }

    public String getIdVerre() {
        return idVerre;
    }

    public void setId_Verre(String idVerre) {
        this.idVerre = idVerre;
    }

    public String getIdPershase() {
        return idPershase;
    }

    public void setIdPershase(String idPershase) {
        this.idPershase = idPershase;
    }

    public String getId_sales() {
        return id_sales;
    }

    public void setId_sales(String id_sales) {
        this.id_sales = id_sales;
    }

    public String getIdMonture() {
        return idMonture;
    }

    public void setIdMonture(String idMonture) {
        this.idMonture = idMonture;
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

    public GlasseRequestDto(String id, boolean isSolaire, int qte_stck,
                            double weight, CategorieDto categorie, String idMonture, String id_sales, String id_Verre, String id_perchase) {
        this.id = id;
        this.isSolaire = isSolaire;
        this.qte_stck = qte_stck;
        this.weight = weight;
        this.categorie = categorie;
        this.idMonture = idMonture;
        this.id_sales = id_sales;
        this.idVerre = id_Verre;
        this.idPershase = id_perchase;
    }
}
