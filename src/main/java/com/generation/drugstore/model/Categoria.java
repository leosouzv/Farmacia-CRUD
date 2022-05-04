package com.generation.drugstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@NotBlank
	@Size(min=5, max=20, message= "Mínimo de 5 caracteres e máximo de 20")
	public String nome;
	
	
	public double avaliacao;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
