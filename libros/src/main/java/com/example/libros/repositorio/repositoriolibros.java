package com.example.libros.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.libros.modelo.libro;


public interface repositoriolibros extends MongoRepository<libro, String> {

    List<libro> findByAutor(String autor);
    List<libro> findByTitulo(String titulo);
}

