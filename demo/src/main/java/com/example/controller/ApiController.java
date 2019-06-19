package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Empleado;
import com.example.service.ServiceDeclaration;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class ApiController {

	@Autowired
	private ServiceDeclaration serviceDeclaration;
	
	@GetMapping("/empleados")
	public List<Empleado> listEmpleados() {
		return serviceDeclaration.ListEmpleados();
	}
}
