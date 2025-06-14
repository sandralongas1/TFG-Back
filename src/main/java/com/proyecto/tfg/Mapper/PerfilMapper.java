package com.proyecto.tfg.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.tfg.Dto.In.PerfilIn;
import com.proyecto.tfg.Entity.Perfil;

import jakarta.persistence.EntityManager;

@Component
public class PerfilMapper {

	@Autowired
	EntityManager entityManager;
	
	public Perfil mapToPerfil(Perfil perfil, PerfilIn perfilIn) {
        if (perfil == null) {
        	perfil = new Perfil();
        	perfil.setQuien(perfilIn.getQuien());
        }

        perfil.setQuienEdita(perfilIn.getQuien());
        perfil.setActivo(perfilIn.isActivo());
        perfil.setDescripcion(perfilIn.getDescripcion());
        perfil.setValor(perfilIn.getValor());

        return perfil;
    }
	
}