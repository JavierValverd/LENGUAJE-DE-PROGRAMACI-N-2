package com.cibertec.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Producto;
@Repository
public interface IProducto extends CrudRepository<Producto, Integer>{

}
