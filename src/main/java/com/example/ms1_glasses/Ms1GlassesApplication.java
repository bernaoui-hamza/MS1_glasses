package com.example.ms1_glasses;

import com.example.ms1_glasses.Dto.CategorieDto;
import com.example.ms1_glasses.Dto.GlasseRequestDto;
import com.example.ms1_glasses.entities.Monture;
import com.example.ms1_glasses.services.CategorieService;
import com.example.ms1_glasses.services.GlasseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
@EnableFeignClients

public class Ms1GlassesApplication {

    public static void main(String[] args) {

        SpringApplication.run(Ms1GlassesApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(GlasseService glasseService, CategorieService categorieService) {

        return args -> {

            CategorieDto c1 = new CategorieDto(UUID.randomUUID().toString(), "ppp", "F");
            Monture m=new Monture("c01","aa","zz","aa");

            categorieService.saveCategorie(c1);
            GlasseRequestDto glasse =
                    new GlasseRequestDto(UUID.randomUUID().toString(), true, 20, 50, c1,"c01","s1","v1","per1");

            glasseService.saveGlasse(glasse);
            glasseService.saveGlasse(
                    new GlasseRequestDto(UUID.randomUUID().toString(), false, 20, 50, c1,"c01","s2","v1","per1"));
            glasseService.saveGlasse(
                    new GlasseRequestDto(UUID.randomUUID().toString(), true, 100, 30, c1,"c02","s1","v1","per1"));

           // glasseService.getGlasse(glasse.getId());
        };
    }


}
