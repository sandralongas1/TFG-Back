package com.proyecto.tfg.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.tfg.Dto.In.CategoriaIn;
import com.proyecto.tfg.Entity.Categoria;

import jakarta.persistence.EntityManager;

@Component
public class CategoriaMapper {

	@Autowired
	EntityManager entityManager;
	
	public Categoria mapToCategoria(Categoria categoria, CategoriaIn categoriaIn) {
        if (categoria == null) {
        	categoria = new Categoria();
        	categoria.setQuien(categoriaIn.getQuien());
        }

        categoria.setQuienEdita(categoriaIn.getQuien());
        categoria.setActivo(categoriaIn.isActivo());
        categoria.setDescripcion(categoriaIn.getDescripcion());
        categoria.setGrupo(categoriaIn.getGrupo());

        return categoria;
    }
	
}