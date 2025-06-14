package com.proyecto.tfg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.tfg.Dto.Out.SubcategoriaOut;
import com.proyecto.tfg.Entity.Subcategoria;

public interface IPlantLoveRepositorySubcategoria extends JpaRepository<Subcategoria, Long> {

	@Query("SELECT new com.proyecto.tfg.Dto.Out.SubcategoriaOut(sc.id, sc.descripcion, c.descripcion) "
			+ "FROM Subcategoria sc "
			+ "JOIN sc.categoria c "
			+ "WHERE sc.activo = true")  
	List<SubcategoriaOut> findAllSubcategoriaActivo();
	
	@Query("SELECT new com.proyecto.tfg.Dto.Out.SubcategoriaOut(sc.id, sc.descripcion, c.descripcion) "
			+ "FROM Subcategoria sc "
			+ "JOIN sc.categoria c "
			+ "WHERE sc.activo = true "
			+ "AND (:idCategoria IS NULL OR c.id = :idCategoria) "
			+ "AND (:grupo IS NULL OR c.grupo = :grupo)")
	List<SubcategoriaOut> findAllSubcategoriaActivoFiltro(@Param("idCategoria") Long id_categoria, @Param("grupo") String grupo);
}
