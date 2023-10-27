package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;
	private String nomProducto;
	
	@ManyToOne
	private Categoria Categoria;
	@ManyToOne
	private Proveedor Proveedor;
	private double precioProducto;
	private int stock;
	
	
	
	public Producto() {
		
	}
	
	public Producto(int idproducto, String nomProducto, com.cibertec.model.Categoria categoria,
			com.cibertec.model.Proveedor proveedor, double precioProducto, int stock) {
		super();
		this.idproducto = idproducto;
		this.nomProducto = nomProducto;
		Categoria = categoria;
		Proveedor = proveedor;
		this.precioProducto = precioProducto;
		this.stock = stock;
	}
	
	public int getIdproducto() {
		return idproducto;
	}
	public String getNomProducto() {
		return nomProducto;
	}
	public Categoria getCategoria() {
		return Categoria;
	}
	public Proveedor getProveedor() {
		return Proveedor;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public int getStock() {
		return stock;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}
	public void setProveedor(Proveedor proveedor) {
		Proveedor = proveedor;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
	

   
}
