package com.proyecto.tfg.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String quien;

    @Column
	private LocalDateTime cuando;

    @Column
    private String quienEdita;
    
    @Column
    private LocalDateTime cuandoEdita;
    
    @Column
    private boolean activo;

    @PrePersist
    protected void onCreate() {
    	cuando = LocalDateTime.now();
    	cuandoEdita = LocalDateTime.now();
    	activo = true;
    }

    @PreUpdate
    protected void onUpdate() {
    	cuandoEdita = LocalDateTime.now();
    }

    // Getters y setters
    public String getQuien() {
		return quien;
	}

	public void setQuien(String quien) {
		this.quien = quien;
	}

	public String getQuienEdita() {
		return quienEdita;
	}

	public void setQuienEdita(String quienEdita) {
		this.quienEdita = quienEdita;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getCuando() {
		return cuando;
	}

	public LocalDateTime getCuandoEdita() {
		return cuandoEdita;
	}
    
}
