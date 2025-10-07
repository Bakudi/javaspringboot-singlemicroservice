package com.example.libros.controlador;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libros.modelo.libro;
import com.example.libros.servicios.servicioLibro;


@RestController
@RequestMapping("/api/libros")
public class controladorlibro {
    private final servicioLibro servicio;

    public controladorlibro(servicioLibro servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<libro> getAll() {
        return servicio.obtenerTodosLosLibros();
    }

    @PostMapping
    public libro create(@RequestBody libro book) {
        return servicio.guardarLibro(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        servicio.eliminarLibro(id);
    }

    @GetMapping("/autor/{autor}")
    public List<libro> getByAutor(@PathVariable String autor) {
        return servicio.buscarPorAutor(autor);
    }
    
}
