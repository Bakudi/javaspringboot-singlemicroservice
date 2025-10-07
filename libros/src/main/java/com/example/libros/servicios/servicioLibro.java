package com.example.libros.servicios;

import com.example.libros.modelo.libro;
import com.example.libros.repositorio.repositoriolibros;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class servicioLibro {
    private final repositoriolibros repositorio;

    public servicioLibro(repositoriolibros repositorio) {
        this.repositorio = repositorio;
    }

    public List<libro> obtenerTodosLosLibros() {
        return repositorio.findAll();
    }
    public libro guardarLibro(libro libro) {
        return repositorio.save(libro);
    }

    public void eliminarLibro(String id) {
        repositorio.deleteById(id);
    }
    public List<libro> buscarPorAutor(String autor) {
        return repositorio.findByAutor(autor);

    }

    }