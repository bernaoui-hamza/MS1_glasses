package com.example.ms1_glasses.mappers;

import com.example.ms1_glasses.Dto.GlasseRequestDto;
import com.example.ms1_glasses.OpenFeign.GlasseRestClient;
import com.example.ms1_glasses.Repositories.CategorieRepository;
import com.example.ms1_glasses.entities.Glasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperGlasse55 {
    @Autowired
    GlasseRestClient glasseRestClient;
    @Autowired
    CategorieRepository categorieRepository;
    public Glasse fromGlassRequestDTO(GlasseRequestDto glasseRequestDto){

        Glasse g1=new Glasse();
        g1.setId(glasseRequestDto.getId());
        g1.setIdMonture(glasseRequestDto.getIdMonture());
        g1.setId_sales(glasseRequestDto.getId_sales());
        g1.setIdPershase(glasseRequestDto.getIdPershase());
        g1.setIdVerre(glasseRequestDto.getIdVerre());
        g1.setVerre(glasseRestClient.getVerre(glasseRequestDto.getIdVerre()));
        g1.setMonture(glasseRestClient.getMonture(glasseRequestDto.getIdMonture()));
        g1.setPerchase(glasseRestClient.getPerchase(glasseRequestDto.getIdPershase()));
        g1.setCategorie(categorieRepository.findById(glasseRequestDto.getCategorie().getId()).get());
        g1.setSales(glasseRestClient.getSales(glasseRequestDto.getId_sales()));
        System.out.println(glasseRequestDto.toString());
        return  g1;

    }
}
