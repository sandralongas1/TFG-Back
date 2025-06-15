package com.proyecto.tfg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.tfg.Dto.Out.ProductoOut;
import com.proyecto.tfg.Entity.Producto;

public interface IPlantLoveRepositoryProducto extends JpaRepository<Producto, Long>{

	@Query("SELECT new com.proyecto.tfg.Dto.Out.ProductoOut(p.id, p.titulo, p.descripcion, p.precio, p.stock, p.imagen, sc.descripcion, c.descripcion) "
			+ "FROM Producto p "
			+ "JOIN p.subcategoria sc "
			+ "JOIN sc.categoria c "
			+ "WHERE p.activo = true")
	List<ProductoOut> findAllProductoActivo();	
	
	@Query("SELECT new com.proyecto.tfg.Dto.Out.ProductoOut(p.id, p.titulo, p.descripcion, p.precio, p.stock, p.imagen, sc.descripcion, c.descripcion) "
			+ "FROM Producto p "
			+ "JOIN p.subcategoria sc "
			+ "JOIN sc.categoria c "
			+ "WHERE p.activo = true "
			+ "AND (:idCategoria IS NULL OR c.id = :idCategoria) "
		    + "AND (:grupo IS NULL OR c.grupo = :grupo)"
		    + "AND (:subcategorias IS NULL OR sc.id IN :subcategorias)")
	List<ProductoOut> findAllProductoActivoFiltro(@Param("idCategoria") Long id_categoria, @Param("grupo") String grupo, @Param("subcategorias") List<Integer> subcategorias);	
	
	@Query("SELECT new com.proyecto.tfg.Dto.Out.ProductoOut(p.id, p.titulo, p.descripcion, p.precio, p.stock, p.imagen, sc.descripcion, c.descripcion) "
			+ "FROM Producto p "
			+ "JOIN p.subcategoria sc "
			+ "JOIN sc.categoria c "
			+ "WHERE p.activo = true "
		    + "AND (:productosIds IS NULL OR p.id IN :productosIds)")
	List<ProductoOut> findAllProductoActivoFiltroIds(@Param("productosIds") List<Integer> productosIds);	
}
