package com.pelicula.pelicula.java.com.pelicula.pelicula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pelicula.pelicula.java.com.pelicula.pelicula.models.pelicula;

public interface peliculaRepository extends JpaRepository<pelicula, Long>{}