package com.proyecto.tfg.Entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class VentaProductoId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "ventas_id")
    private Long ventaId;

    @Column(name = "productos_id")
    private Long productoId;

    // Constructor, getters, setters, equals y hashCode

    public VentaProductoId() {}

    public VentaProductoId(Long ventaId, Long productoId) {
        this.ventaId = ventaId;
        this.productoId = productoId;
    }

    // Getters y setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VentaProductoId)) return false;
        VentaProductoId that = (VentaProductoId) o;
        return Objects.equals(ventaId, that.ventaId) &&
               Objects.equals(productoId, that.productoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ventaId, productoId);
    }
}

