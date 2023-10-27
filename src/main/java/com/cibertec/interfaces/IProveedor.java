package com.cibertec.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Proveedor;
@Repository
public interface IProveedor extends CrudRepository<Proveedor, Integer>{

	

}

