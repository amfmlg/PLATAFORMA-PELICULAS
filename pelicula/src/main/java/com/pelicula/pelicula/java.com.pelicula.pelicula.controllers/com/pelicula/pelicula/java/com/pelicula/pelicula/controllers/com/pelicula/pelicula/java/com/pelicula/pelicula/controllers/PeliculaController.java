import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pelicula.pelicula.java.com.pelicula.pelicula.repositories.usuarioRepository;
import com.pelicula.pelicula.java.com.pelicula.pelicula.models.pelicula;
import java.util.List;

@RestController
@RequestMapping("/api/pelicula/")
public class peliculaController {
    @Autowired
    private peliculaRepository peliRepo;
    
    @GetMapping
    public List<pelicula> getAllUsuarios() {
        return peliRepo.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<usuario> getPersonaById(@PathVariable Long id) {
        Optional<pelicula> persona = peliRepo.findById(id);
        return persona.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
}