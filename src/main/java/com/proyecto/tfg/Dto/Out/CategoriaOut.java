package com.proyecto.tfg.Dto.Out;


public class CategoriaOut {
	
    private Long id;
	
	private String descripcion;
	
	private String grupo;
	
	public CategoriaOut() {}

	public CategoriaOut(Long id, String descripcion, String grupo) {
		this.id = id;
		this.descripcion = descripcion;
		this.grupo = grupo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Long getId() {
		return id;
	}

	
	
	
}
