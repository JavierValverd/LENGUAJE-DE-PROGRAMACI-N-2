package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idCategoria;
  private String nomCategoria;
  
  
  public Categoria() {
	  
  }
  
  
public Categoria(int idCategoria, String nomCategoria) {
	super();
	this.idCategoria = idCategoria;
	this.nomCategoria = nomCategoria;
}

public int getIdCategoria() {
	return idCategoria;
}
public String getNomCategoria() {
	return nomCategoria;
}
public void setIdCategoria(int idCategoria) {
	this.idCategoria = idCategoria;
}
public void setNomCategoria(String nomCategoria) {
	this.nomCategoria = nomCategoria;
}
  
}
