package com.proyecto.tfg.Entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class NoticiaUsuarioId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "usuarios_id")
    private Long usuarioId;

    @Column(name = "noticias_id")
    private Long noticiaId;

    // Constructor, getters, setters, equals y hashCode

    public NoticiaUsuarioId() {}

    public NoticiaUsuarioId(Long usuarioId, Long noticiaId) {
        this.usuarioId = usuarioId;
        this.noticiaId = noticiaId;
    }

    // Getters y setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoticiaUsuarioId)) return false;
        NoticiaUsuarioId that = (NoticiaUsuarioId) o;
        return Objects.equals(usuarioId, that.usuarioId) &&
               Objects.equals(noticiaId, that.noticiaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioId, noticiaId);
    }
}

