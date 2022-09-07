package com.example.ms1_glasses.services;

import com.example.ms1_glasses.Dto.CategorieDto;

import java.util.List;

public interface CategorieService {
    CategorieDto saveCategorie(CategorieDto categorieDto);
    public List<CategorieDto> categorieDtos();
}
