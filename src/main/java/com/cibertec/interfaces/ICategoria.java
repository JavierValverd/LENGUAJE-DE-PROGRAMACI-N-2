package com.cibertec.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Categoria;

@Repository
public interface ICategoria extends CrudRepository<Categoria, Integer>{

}
