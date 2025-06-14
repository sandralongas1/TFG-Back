package com.proyecto.tfg.Dto.In;


public class PerfilIn {
		
    private Long id;

    private String quien;
    
    private boolean activo;
	
	private String descripcion;
	
	private String valor;

	public PerfilIn() {}

	public PerfilIn(Long id, String quien, boolean activo, String descripcion, String valor) {
		this.id = id;
		this.quien = quien;
		this.activo = activo;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getQuien() {
		return quien;
	}

	public void setQuien(String quien) {
		this.quien = quien;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
