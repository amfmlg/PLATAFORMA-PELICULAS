package com.pelicula.pelicula.java.com.pelicula.pelicula.repositories;
import com.pelicula.pelicula.java.com.pelicula.pelicula.models.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<usuario, Long>{}