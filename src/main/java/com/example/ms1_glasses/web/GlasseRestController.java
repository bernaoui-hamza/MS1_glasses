package com.example.ms1_glasses.web;

import com.example.ms1_glasses.Dto.CategorieDto;
import com.example.ms1_glasses.Dto.GlasseRequestDto;
import com.example.ms1_glasses.Dto.GlasseResponseDto;
import com.example.ms1_glasses.entities.Categorie;
import com.example.ms1_glasses.entities.Glasse;
import com.example.ms1_glasses.services.CategorieService;
import com.example.ms1_glasses.services.GlasseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class GlasseRestController {
    public GlasseRestController(GlasseService glasseService,CategorieService categorieService) {
        this.glasseService = glasseService;
        this.categorieService=categorieService;
    }

    GlasseService glasseService;
    CategorieService categorieService;
    @GetMapping(path = "/listGlasse")
    public List<GlasseResponseDto> getGlasses(){
        List<GlasseResponseDto> list =    glasseService.listGlasses();
        return list;
    }
    @GetMapping(path = "/listGlasseByCat")
    public List<GlasseResponseDto> getGlassesByCat(Categorie c){
        return   glasseService.listGlassesByCategory(c);
    }
    @GetMapping(path = "/listCategorie")
    public List<CategorieDto> getCategories(){
        return  categorieService.categorieDtos();
    }
    @GetMapping(path = "/glasse/{id}")
    public GlasseResponseDto getGlasse(@PathVariable(name = "id") String id){
        return glasseService.getGlasse(id);
    }
    @PostMapping(path = "/saveGlasse")
    public GlasseResponseDto saveGlasse(@RequestBody GlasseRequestDto glasse){

        return glasseService.saveGlasse(glasse);
    }

}
