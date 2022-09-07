package com.example.ms1_glasses.OpenFeign;


import com.example.ms1_glasses.entities.Monture;
import com.example.ms1_glasses.entities.Perchase;
import com.example.ms1_glasses.entities.Sales;
import com.example.ms1_glasses.entities.Verre;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="GLASSE-SERVICE2",url = "http://localhost:8084")
public interface GlasseRestClient {
    @GetMapping(path = "/api/getMonture/{id}")
    Monture getMonture(@PathVariable(name="id") String id);
    @GetMapping(path = "/api/listMonture")
    List<Monture> listMonture();
    @GetMapping(path = "/api/listSales")
    List<Sales> listeSales();
    @GetMapping(path = "/api/getSale/{id}")
            Sales getSales(@PathVariable(name = "id") String id);
    @GetMapping(path = "/api/getVerre/{id}")
    Verre getVerre(@PathVariable(name = "id") String id);
    @GetMapping(path = "/api/getPerchase/{id}")
    Perchase getPerchase(@PathVariable(name = "id") String id);

}
