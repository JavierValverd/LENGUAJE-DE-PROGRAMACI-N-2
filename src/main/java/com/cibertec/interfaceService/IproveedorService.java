package com.cibertec.interfaceService;

import java.util.List;
import java.util.Optional;


import com.cibertec.model.Proveedor;

public interface IproveedorService {
	public List<Proveedor>listar();
	public Optional<Proveedor>listarId(int id);
	public int save(Proveedor prov);
	public void delete(int id);
}
