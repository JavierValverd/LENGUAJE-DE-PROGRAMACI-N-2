package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.interfaceService.IproductoService;
import com.cibertec.model.Producto;


import jakarta.validation.Valid;


@Controller
@RequestMapping
public class ControllerP {
  
	@Autowired
	private IproductoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Producto>productos = service.listar();
		model.addAttribute("productos", productos);
		return "index";
	}
	
	@GetMapping("/newProducto")
	public String agregar(Model model) {
		model.addAttribute("producto", new Producto());
		return "formulario";
	}
	

	@PostMapping("/guardarProducto")
	public String save(@Valid Producto p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
	
}
