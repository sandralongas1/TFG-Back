package com.proyecto.tfg.Dto.Out;


public class PerfilOut {
	
    private Long id;
	
	private String descripcion;
	
	private String valor;
	
	public PerfilOut() {}

	public PerfilOut(Long id, String descripcion, String valor) {
		this.id = id;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}
	
}
