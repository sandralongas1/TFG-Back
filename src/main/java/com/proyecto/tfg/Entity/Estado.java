package com.proyecto.tfg.Entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="estados")
@NoArgsConstructor
@AllArgsConstructor
public class Estado extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message = "El campo descripción no puede estar vacío")
	private String descripcion;
	
	@NotEmpty(message = "El campo valor no puede estar vacío")
	private String valor;

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
	
	
}
