package com.proyecto.tfg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.tfg.Dto.Out.VentaProductoOut;
import com.proyecto.tfg.Entity.VentaProductoId;
import com.proyecto.tfg.Entity.Venta_Producto;

public interface IPlantLoveRepositoryVentaProducto extends JpaRepository<Venta_Producto, VentaProductoId>{

	@Query("SELECT new com.proyecto.tfg.Dto.Out.VentaProductoOut(p.titulo, vp.cantidad, vp.precio) "
			+ "FROM Venta_Producto vp "
			+ "JOIN vp.producto p "
			+ "WHERE vp.venta.id = :idVenta")  
	List<VentaProductoOut> findAllProductosByVenta(@Param("idVenta") Long id_venta);
}
