package com.pelicula.pelicula.java.com.pelicula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pelicula.pelicula.java.com.pelicula.pelicula.repositories.usuarioRepository;
import com.pelicula.pelicula.java.com.pelicula.pelicula.models.usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/usuario/")
public class UsuarioController {
    @Autowired
    private usuarioRepository usuarioRepo;
    
    @GetMapping
    public List<usuario> getAllUsuarios() {
        return usuarioRepo.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<usuario> getPersonaById(@PathVariable Long id) {
        Optional<usuario> persona = usuarioRepo.findById(id);
        return persona.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
}
