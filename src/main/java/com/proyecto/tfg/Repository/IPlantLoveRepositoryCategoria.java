package com.proyecto.tfg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.proyecto.tfg.Dto.Out.CategoriaOut;
import com.proyecto.tfg.Entity.Categoria;

public interface IPlantLoveRepositoryCategoria extends CrudRepository<Categoria, Long> {

	@Query("SELECT new com.proyecto.tfg.Dto.Out.CategoriaOut(id, descripcion, grupo) FROM Categoria WHERE activo = true")  
	List<CategoriaOut> findAllCategoriaActivo();
	
}
