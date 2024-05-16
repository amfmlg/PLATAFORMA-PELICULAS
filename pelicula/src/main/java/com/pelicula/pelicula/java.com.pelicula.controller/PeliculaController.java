package com.pelicula.pelicula.java.com.pelicula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pelicula.pelicula.java.com.pelicula.pelicula.models.pelicula;
import com.pelicula.pelicula.java.com.pelicula.pelicula.models.usuario;
import com.pelicula.pelicula.java.com.pelicula.pelicula.repositories.peliculaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/pelicula/")
public class PeliculaController {
    @Autowired
    private peliculaRepository peliRepo;
    
    @GetMapping
    public List<pelicula> getAllUsuarios() {
        return peliRepo.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<pelicula> getPersonaById(@PathVariable Long id) {
        Optional<pelicula> pelicula = peliRepo.findById(id);
        return pelicula.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
} 