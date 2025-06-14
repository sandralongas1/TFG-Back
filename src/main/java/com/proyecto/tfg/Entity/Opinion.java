package com.proyecto.tfg.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="opiniones")
@NoArgsConstructor
@AllArgsConstructor
public class Opinion extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	private int puntuacion;
	
	@NotEmpty(message = "El campo descripción no puede estar vacío")
	private String descripcion;
	
	@ManyToOne
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
	private Usuario usuario;
	
	@ManyToOne
    @JoinColumn(name = "productos_id", referencedColumnName = "id")
	private Producto producto;
	
	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	
}
