package com.example.ms1_glasses.Repositories;

import com.example.ms1_glasses.entities.Categorie;
import com.example.ms1_glasses.entities.Glasse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GlasseRepositorie extends JpaRepository<Glasse,String> {
    List<Glasse> findGlasseByCategorie(Categorie categorie);


}
