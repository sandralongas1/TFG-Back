package com.proyecto.tfg.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.proyecto.tfg.Dto.Out.VentaOut;
import com.proyecto.tfg.Entity.Venta;

public interface IPlantLoveRepositoryVenta extends CrudRepository<Venta, Long>{

	@Query("SELECT new com.proyecto.tfg.Dto.Out.VentaOut(v.id, v.totalPrecio, v.fechaEntrega, e.descripcion, u.id, u.nombre, u.apellidos) "
			+ "FROM Venta v "
			+ "JOIN v.usuario u "
			+ "JOIN v.estado e "
			+ "WHERE v.activo = true "
			+ "AND (:idUsuario IS NULL OR u.id = :idUsuario) "
			+ "AND (:fechaMin IS NULL OR v.fechaEntrega >= :fechaMin)"
			+ "AND (:fechaMax IS NULL OR v.fechaEntrega <= :fechaMax)")  
	List<VentaOut> findAllVentaFilter(@Param("idUsuario") Long id_usuario, @Param("fechaMin") LocalDate fechaMin, @Param("fechaMax") LocalDate fechaMax);
}
