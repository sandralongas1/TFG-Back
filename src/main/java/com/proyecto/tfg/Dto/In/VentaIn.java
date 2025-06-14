package com.proyecto.tfg.Dto.In;

import java.time.LocalDate;
import java.util.List;

public class VentaIn {

    private String quien;
	
	private Long id_usuario;
	
	private LocalDate fechaEntrega;

	private double totalPrecio;
	
	private List<VentaProductoIn> productos;
	
	public VentaIn() {}

	public VentaIn(String quien, Long id_usuario, LocalDate fechaEntrega, double totalPrecio, List<VentaProductoIn> productos) {
		this.quien = quien;
		this.id_usuario = id_usuario;
		this.fechaEntrega = fechaEntrega;
		this.totalPrecio = totalPrecio;
		this.productos = productos;
	}

	public String getQuien() {
		return quien;
	}

	public void setQuien(String quien) {
		this.quien = quien;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public double getTotalPrecio() {
		return totalPrecio;
	}

	public void setTotalPrecio(double totalPrecio) {
		this.totalPrecio = totalPrecio;
	}

	public List<VentaProductoIn> getProductos() {
		return productos;
	}

	public void setProductos(List<VentaProductoIn> productos) {
		this.productos = productos;
	}
	
}
