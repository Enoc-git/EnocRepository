package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Empleado;
import com.example.model.EmpleadoDAO;

@Service
public class ServiceImplementation implements ServiceDeclaration {

	@Autowired
	private EmpleadoDAO empleadoDao;

	@Override
	public List<Empleado> ListEmpleados() {
		return empleadoDao.findAll();
	}
}