package com.example.ms1_glasses.services;

import com.example.ms1_glasses.Dto.CategorieDto;
import com.example.ms1_glasses.Dto.GlasseRequestDto;
import com.example.ms1_glasses.Dto.GlasseResponseDto;
import com.example.ms1_glasses.OpenFeign.GlasseRestClient;
import com.example.ms1_glasses.Repositories.GlasseRepositorie;
import com.example.ms1_glasses.entities.Categorie;
import com.example.ms1_glasses.entities.Glasse;


import com.example.ms1_glasses.entities.Monture;
import com.example.ms1_glasses.entities.Verre;
import com.example.ms1_glasses.mappers.*;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional

public class GlasseServiceImpl implements GlasseService {


    @Autowired
    private MapperGlasse12 mapperGlasse;
    @Autowired
    private MapperGlasse55 mapperGlasse55;
    @Autowired
    private MapperCategorie mapperCategorie;

    @Autowired
    private GlasseRestClient glasseRestClient;
    @Autowired
    private GlasseRepositorie glasseRepositorie;

    public GlasseRestClient getGlasseRestClient() {
        return glasseRestClient;
    }

    public void setGlasseRestClient(GlasseRestClient glasseRestClient) {
        this.glasseRestClient = glasseRestClient;
    }

    public GlasseServiceImpl() {
    }

    @Override
    public GlasseResponseDto saveGlasse(GlasseRequestDto glasseRequestDto) {
        System.out.println(glasseRequestDto.toString());

        Glasse glasse = mapperGlasse55.fromGlassRequestDTO(glasseRequestDto);


      //  glasse.getCategorie().setId(glasseRequestDto.getCategorie().getId());
//        Monture m=new Monture("c01","AA","AA","AA");
//        glasse.setMonture(m);
//        glasse.setVerre(new Verre("v1","verre1","casa"));

        Glasse g11 = glasseRepositorie.save(glasse);

        GlasseResponseDto glasseResponseDto
         = mapperGlasse.fromGlasse(glasse);
        return glasseResponseDto;
    }

    @Override
    public GlasseResponseDto getGlasse(String id) {
        Glasse g1 = glasseRepositorie.findById(id).get();
        System.out.println(g1.getId() + "---------");
        Monture m=glasseRestClient.getMonture(g1.getIdMonture());
        GlasseResponseDto glasseResponseDto = mapperGlasse.fromGlasse(g1);
        System.out.println(glasseResponseDto.getQte_stck() + "--" + glasseResponseDto.getWeight() + "--" + glasseResponseDto);
        return glasseResponseDto;
    }

    @Override
    public List<GlasseResponseDto> listGlasses() {
        List<Glasse> glasseList = glasseRepositorie.findAll();
        List<GlasseResponseDto> glasseResponseDt=new ArrayList<GlasseResponseDto>();
        for (Glasse gl : glasseList) {
            try {
                System.out.println(gl.getIdMonture()+"--verre:"+gl.getIdVerre()+"---pershase"+gl.getIdPershase());
                GlasseResponseDto glasseResponseDto=new GlasseResponseDto();
                glasseResponseDto.setId(gl.getId());
                glasseResponseDto.setSolaire(gl.isSolaire());

                glasseResponseDto.setMonture(glasseRestClient.getMonture(gl.getIdMonture()));
                glasseResponseDto.setSales(glasseRestClient.getSales(gl.getId_sales()));
                //System.out.println(glasseRestClient.getPerchase("per1"));
               glasseResponseDto.setPerchase(glasseRestClient.getPerchase(gl.getIdPershase()));
                System.out.println("toString::::"+glasseRestClient.getPerchase(gl.getIdPershase()).toString());
                glasseResponseDto.setVerre(glasseRestClient.getVerre(gl.getIdVerre()));
                glasseResponseDto.setSales(glasseRestClient.getSales(gl.getId_sales()));
                glasseResponseDto.setCategorie(mapperCategorie.fromCategorie(gl.getCategorie()));
                glasseResponseDt.add(glasseResponseDto);
               // System.out.println(glasseRestClient.getSales(gl.getId_sales()).getNom_sales()+"---id:"+glasseRestClient.getSales(gl.getId_sales()).getId());
               // glasseResponseDt.add(new GlasseResponseDto())
                // System.out.println("id::"+gl.getMonture().getIdMonture());
               // System.out.println("id----1"+glasseRestClient.getMonture(gl.getIdMonture()).getIdMonture());
               // gl.setMonture( glasseRestClient.getMonture(gl.getIdMonture()));
               // System.out.println();
               // gl.setMonture(monture);

            } catch (Exception e) {
                e.printStackTrace();
            }


        }

//        List<GlasseResponseDto> glasseResponseDtos = glasseList.stream()
//                .map(glasse -> mapperGlasse.fromGlasse(glasse)).collect(Collectors.toList());

        return glasseResponseDt;
    }


    @Override
    public List<GlasseResponseDto> listGlassesByCategory(Categorie category) {
        List<Glasse> glasseList=glasseRepositorie.findGlasseByCategorie(category);
        List<GlasseResponseDto> glasseResponseDtos=glasseList.stream()
                .map(glasse -> mapperGlasse.fromGlasse(glasse)).collect(Collectors.toList());
        return glasseResponseDtos;
    }


}
