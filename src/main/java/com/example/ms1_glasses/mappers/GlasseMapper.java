package com.example.ms1_glasses.mappers;

import com.example.ms1_glasses.Dto.GlasseRequestDto;
import com.example.ms1_glasses.Dto.GlasseResponseDto;
import com.example.ms1_glasses.entities.Glasse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GlasseMapper {
    GlasseResponseDto fromGlasse(Glasse glasse);
    Glasse fromGlasseRequestDto(GlasseRequestDto glasseRequestDto);
    //Categorie fromCategorieDto(CategorieDto categorieDto);
   // CategorieDto fromCategorie(Categorie categorie);
}
