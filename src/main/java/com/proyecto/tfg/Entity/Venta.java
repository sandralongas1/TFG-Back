package com.proyecto.tfg.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name="ventas")
@NoArgsConstructor
@AllArgsConstructor
public class Venta extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private double totalPrecio;
	
	private LocalDate fechaEntrega;
	
	@ManyToOne
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
	private Usuario usuario;
	
	@ManyToOne
    @JoinColumn(name = "estados_id", referencedColumnName = "id")
	private Estado estado;

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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
