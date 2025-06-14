package com.proyecto.tfg.Dto.In;


public class SubcategoriaFilterIn {
	
	private Long id_categoria;
	
	private String grupo;

	public SubcategoriaFilterIn() {}
	
	public SubcategoriaFilterIn(Long id_categoria, String grupo) {
		this.id_categoria = id_categoria;
		this.grupo = grupo;
	}

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}	
	
}
