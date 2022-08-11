package com.ironhack.http_start.controller;

import com.ironhack.http_start.dto.CoffeDTO;
import com.ironhack.http_start.services.CoffeImpleSERV;
import com.ironhack.http_start.services.CoffeSERV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/coffe")
public class CoffeController {

    //CALL THE INTERFACE OF SERVICE
    @Autowired
    @Qualifier("coffee")        /// ESPECIFICACIÓN A QUÉ IMPLEMENTACIÓN LLAMAR
    CoffeSERV coff;


    // Basics Implementing the Service Interface for using methods
    // REQUEST WITH A PARAMETER for search a entity with id especific
    @GetMapping(path = "/{id}")
    public CoffeDTO getOne(@PathVariable int id){ // METHOD WITH ARGUMENT FOR SEARCH

        return coff.getById(id);
    }

    // REQUEST  for search a list entitys implementing the services Entity with autowired
    @GetMapping(path = "all")
    public List <CoffeDTO> getAll(){
        return coff.getAll();
    }

    @GetMapping(path = "/name/{name}")
    public CoffeDTO getCoffeByName(@PathVariable("name") String name){
        return coff.getByName(name);
    }

    @GetMapping(path = "/type/{type}")
    public CoffeDTO getByType(@PathVariable("type") String type){
        return coff.getByType(type);
    }
    //*************************************** BASICS WITH ENTITY DIRECTLY
    //*** Mapping basics
    /*public CoffeDTO callEntity(){
        return new CoffeDTO("Americano", "black");
    }*/

    //*** Calling API for a list of coffe just with entity
    /*@GetMapping("/coffes")
   /* public List <CoffeDTO> coffes(){
        return List.of(
            new CoffeDTO("Americano", "black"),
            new CoffeDTO("Espresso", "short"),
            new CoffeDTO("Mocaccino", "brown")
        );
    }*/

}
