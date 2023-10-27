package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedor")
public class Proveedor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
 private int idProveedor;
 private String nomProveedor;
 private String fonoProveedor;
 
 public Proveedor() {
	 
 }
 
public Proveedor(int idProveedor, String nomProveedor, String fonoProveedor) {
	super();
	this.idProveedor = idProveedor;
	this.nomProveedor = nomProveedor;
	this.fonoProveedor = fonoProveedor;
}
public int getIdProveedor() {
	return idProveedor;
}
public String getNomProveedor() {
	return nomProveedor;
}
public String getFonoProveedor() {
	return fonoProveedor;
}
public void setIdProveedor(int idProveedor) {
	this.idProveedor = idProveedor;
}
public void setNomProveedor(String nomProveedor) {
	this.nomProveedor = nomProveedor;
}
public void setFonoProveedor(String fonoProveedor) {
	this.fonoProveedor = fonoProveedor;
}
   
 
}
