package com.example.ms1_glasses.services;

import com.example.ms1_glasses.Dto.CategorieDto;
import com.example.ms1_glasses.Repositories.CategorieRepository;
import com.example.ms1_glasses.entities.Categorie;
import com.example.ms1_glasses.mappers.MapperCategorie;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class CategorieServiceImpl implements CategorieService {
    CategorieRepository categorieRepository;
    MapperCategorie mapperCategorie;

    public CategorieServiceImpl(CategorieRepository categorieRepository, MapperCategorie mapperCategorie) {
        this.categorieRepository = categorieRepository;
        this.mapperCategorie = mapperCategorie;
    }

    @Override
    public CategorieDto saveCategorie(CategorieDto categorieDto) {
        Categorie cat =mapperCategorie.fromCategorieDto(categorieDto);
cat.setId(categorieDto.getId());
        categorieRepository.save(cat);
        CategorieDto categorieDto1=mapperCategorie.fromCategorie(cat);
        categorieDto1.setId(categorieDto.getId());
        return categorieDto1;
    }
    @Override
    public List<CategorieDto> categorieDtos(){
        List<Categorie>categories=categorieRepository.findAll();

        return categories.stream().map(categorie -> mapperCategorie.fromCategorie(categorie)).collect(Collectors.toList());
    }
}
