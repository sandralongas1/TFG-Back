package com.proyecto.tfg.Entity;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="noticias_usuarios")
@NoArgsConstructor
@AllArgsConstructor
public class Noticia_Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
    private NoticiaUsuarioId id;

	@ManyToOne
	@MapsId("usuarioId") // hace referencia al campo de la clave embebida
    @JoinColumn(name = "usuarios_id")
	private Usuario usuario;
	
	@ManyToOne
	@MapsId("noticiaId") // hace referencia al campo de la clave embebida
    @JoinColumn(name = "noticias_id")
	private Noticia noticia;
	
}
