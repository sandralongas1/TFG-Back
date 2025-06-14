package com.proyecto.tfg.Dto.In;

import java.time.LocalDate;

public class VentaFilterIn {

	private Long id_usuario;
	
	private LocalDate fechaMin;
	
	private LocalDate fechaMax;
	
	public VentaFilterIn() {}

	public VentaFilterIn(Long id_usuario, LocalDate fechaMin, LocalDate fechaMax) {
		super();
		this.id_usuario = id_usuario;
		this.fechaMin = fechaMin;
		this.fechaMax = fechaMax;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public LocalDate getFechaMin() {
		return fechaMin;
	}

	public void setFechaMin(LocalDate fechaMin) {
		this.fechaMin = fechaMin;
	}

	public LocalDate getFechaMax() {
		return fechaMax;
	}

	public void setFechaMax(LocalDate fechaMax) {
		this.fechaMax = fechaMax;
	}
	
	
}
