package com.example.ms1_glasses.services;

import com.example.ms1_glasses.Dto.CategorieDto;
import com.example.ms1_glasses.Dto.GlasseRequestDto;
import com.example.ms1_glasses.Dto.GlasseResponseDto;
import com.example.ms1_glasses.entities.Categorie;
import com.example.ms1_glasses.entities.Glasse;
import org.springframework.stereotype.Service;


import java.util.List;

public interface GlasseService {
    GlasseResponseDto saveGlasse(GlasseRequestDto glasseRequestDto);
    GlasseResponseDto getGlasse(String id);
    List<GlasseResponseDto> listGlasses();
    List<GlasseResponseDto> listGlassesByCategory(Categorie cat);
}
