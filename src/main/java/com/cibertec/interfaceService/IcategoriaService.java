package com.cibertec.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cibertec.model.Categoria;


public interface IcategoriaService {
	
	public List<Categoria>listar();
	public Optional<Categoria>listarId(int id);
	public int save(Categoria cate);
	public void delete(int id);
}
