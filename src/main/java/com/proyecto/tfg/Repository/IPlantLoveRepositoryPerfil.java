package com.proyecto.tfg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyecto.tfg.Dto.Out.PerfilOut;
import com.proyecto.tfg.Entity.Perfil;

public interface IPlantLoveRepositoryPerfil extends CrudRepository<Perfil, Long>{

	@Query("SELECT new com.proyecto.tfg.Dto.Out.PerfilOut(id, descripcion, valor) FROM Perfil WHERE activo = true")  
	List<PerfilOut> findAllPerfilActivo();
}
