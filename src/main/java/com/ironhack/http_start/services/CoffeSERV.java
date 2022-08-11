package com.ironhack.http_start.services;

import com.ironhack.http_start.controller.CoffeController;
import com.ironhack.http_start.dto.CoffeDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface CoffeSERV {

    CoffeDTO getById(int id);
    List<CoffeDTO> getAll();

    CoffeDTO getByName(String name);

    CoffeDTO getByType(String type);
}
