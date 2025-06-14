package com.proyecto.tfg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.tfg.Entity.Estado;

public interface IPlantLoveRepositoryEstado extends JpaRepository<Estado, Long>{

	Estado findByValor(String valor); // Busca por el campo valor
}

