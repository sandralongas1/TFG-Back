package com.proyecto.tfg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.tfg.Dto.Out.UsuarioOut;
import com.proyecto.tfg.Entity.Usuario;

public interface IPlantLoveRepositoryUsuario extends JpaRepository<Usuario, Long>{

	 Usuario findByUsuario(String usuario); // Busca por nombre de usuario
	 
	 Usuario findByEmail(String email); // Busca por email
	 
	 @Query("SELECT new com.proyecto.tfg.Dto.Out.UsuarioOut(u.id, u.nombre, u.apellidos, u.dni, u.telf, u.direccion, u.email, u.usuario, u.imagen, u.perfil.descripcion) FROM Usuario u WHERE activo = true")  
	 List<UsuarioOut> findAllUsuarioActivo();

}
