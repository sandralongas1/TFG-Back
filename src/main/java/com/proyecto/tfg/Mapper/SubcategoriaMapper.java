package com.proyecto.tfg.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.tfg.Dto.In.SubcategoriaIn;
import com.proyecto.tfg.Entity.Subcategoria;

import jakarta.persistence.EntityManager;

@Component
public class SubcategoriaMapper {

	@Autowired
	EntityManager entityManager;
	
	public Subcategoria mapToSubcategoria(Subcategoria subcategoria, SubcategoriaIn subcategoriaIn) {
        if (subcategoria == null) {
        	subcategoria = new Subcategoria();
        	subcategoria.setQuien(subcategoriaIn.getQuien());
        }

        subcategoria.setQuienEdita(subcategoriaIn.getQuien());
        subcategoria.setActivo(subcategoriaIn.isActivo());
        subcategoria.setDescripcion(subcategoriaIn.getDescripcion());
        
        return subcategoria;
    }
	
}