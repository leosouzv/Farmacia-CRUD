package com.generation.drugstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.drugstore.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByTituloContainingIgnoreCase(String titulo);

}