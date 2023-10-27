package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.interfaceService.IcategoriaService;
import com.cibertec.interfaces.ICategoria;

import com.cibertec.model.Categoria;


@Service
public class CategoriaService implements IcategoriaService {

	@Autowired
	private ICategoria data;
	
	
	@Override
	public List<Categoria> listar() {
		return (List<Categoria>)data.findAll();
	}
	
	@Override
	public Optional<Categoria> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Categoria cate) {
		int cat=0;
		Categoria categoria=data.save(cate);
		if(!categoria.equals(null)) {
			cat=1;
		}
		return cat;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
