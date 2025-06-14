package com.proyecto.tfg.Dto.Out;

import java.time.LocalDate;

public class VentaOut {
	
	private Long id;
	
	private double totalPrecio;
	
	private LocalDate fechaEntrega;
	
	private String estado;
	
	private Long user_id;
	
	private String user_nombre;
	
	private String user_apellidos;
	
	public VentaOut() {}

	public VentaOut(Long id, double totalPrecio, LocalDate fechaEntrega, String estado, Long user_id,
			String user_nombre, String user_apellidos) {
		this.id = id;
		this.totalPrecio = totalPrecio;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		this.user_id = user_id;
		this.user_nombre = user_nombre;
		this.user_apellidos = user_apellidos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTotalPrecio() {
		return totalPrecio;
	}

	public void setTotalPrecio(double totalPrecio) {
		this.totalPrecio = totalPrecio;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}

	public String getUser_apellidos() {
		return user_apellidos;
	}

	public void setUser_apellidos(String user_apellidos) {
		this.user_apellidos = user_apellidos;
	}
	
	
}
