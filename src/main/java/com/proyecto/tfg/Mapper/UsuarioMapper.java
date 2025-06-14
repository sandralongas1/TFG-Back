package com.proyecto.tfg.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.tfg.Dto.In.UsuarioIn;
import com.proyecto.tfg.Entity.Perfil;
import com.proyecto.tfg.Entity.Usuario;

import jakarta.persistence.EntityManager;

@Component
public class UsuarioMapper {

	@Autowired
	EntityManager entityManager;
	
	public Usuario mapToUsuario(Usuario usuario, UsuarioIn usuarioIn) {
        if (usuario == null) {
        	usuario = new Usuario();
        	usuario.setQuien(usuarioIn.getQuien());
        }

        usuario.setQuienEdita(usuarioIn.getQuien());
        usuario.setActivo(usuarioIn.isActivo());
        usuario.setNombre(usuarioIn.getNombre());
        usuario.setApellidos(usuarioIn.getApellidos());
        usuario.setDni(usuarioIn.getDni());
        usuario.setTelf(usuarioIn.getTelf());
        usuario.setDireccion(usuarioIn.getDireccion());
        usuario.setEmail(usuarioIn.getEmail());
        usuario.setUsuario(usuarioIn.getUsuario());
        usuario.setClave(usuarioIn.getClave());
        usuario.setImagen(usuarioIn.getImagen());

        Perfil perfil = entityManager.getReference(Perfil.class, usuarioIn.getId_perfil());
        usuario.setPerfil(perfil);
        
        return usuario;
    }
	
}