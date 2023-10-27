package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.interfaceService.IproductoService;

import com.cibertec.interfaces.IProducto;
import com.cibertec.model.Producto;


@Service
public class ProductoService implements IproductoService {

	
	
	
	
	
	@Autowired
	private IProducto data;
	
	
	@Override
	public List<Producto> listar() {
		return (List<Producto>)data.findAll();
	}
	
	@Override
	public Optional<Producto> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Producto p) {
		int pro=0;
		Producto producto=data.save(p);
		if(!producto.equals(null)) {
			pro=1;
		}
		return pro;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
