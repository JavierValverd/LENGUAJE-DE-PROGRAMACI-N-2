package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.interfaceService.IproveedorService;

import com.cibertec.interfaces.IProveedor;
import com.cibertec.model.Proveedor;


@Service
public class ProveedorService implements IproveedorService{

	@Autowired
	private IProveedor data;
	
	
	@Override
	public List<Proveedor> listar() {
		return (List<Proveedor>)data.findAll();
	}

	@Override
	public Optional<Proveedor> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Proveedor prov) {
		int res=0;
		Proveedor proveedor=data.save(prov);
		if(!proveedor.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
