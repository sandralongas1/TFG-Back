package com.proyecto.tfg.Entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="categorias")
@NoArgsConstructor
@AllArgsConstructor
public class Categoria extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message = "El campo descripción no puede estar vacío")
	private String descripcion;
	
	@NotEmpty(message = "El campo grupo no puede estar vacío")
	private String grupo;
	
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
	
	
}
