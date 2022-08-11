package com.ironhack.http_start.services;

import com.ironhack.http_start.dto.CoffeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("coffee") // -- especificidad del service con notación para implementar en el 'Qualifier' en controller
public class CoffeImpleSERV implements CoffeSERV {

    private List <CoffeDTO> coffes = List.of(
            new CoffeDTO("Americano", "black"),
            new CoffeDTO("Espresso", "short"),
            new CoffeDTO("Mocaccino", "brown")
    );


    @Override
    public CoffeDTO getById(int id) {
        return coffes.get(id);
    }

    @Override
    public List<CoffeDTO> getAll() {
        return coffes;
    }

    @Override
    public CoffeDTO getByName(String name) {
        for(var i : coffes){
            if(i.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return null;
    }

    @Override
    public CoffeDTO getByType(String type) {
        for(var i : coffes){
            if(i.getType().equalsIgnoreCase(type)){
                return i;
            }
        }
        return null;
    }


}
