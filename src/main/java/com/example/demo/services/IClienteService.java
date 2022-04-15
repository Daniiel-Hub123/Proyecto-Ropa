package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.models.Cliente;

public interface IClienteService {
	public Iterable<Cliente> findAllCliente();
	public Page<Cliente> findAllCliente(Pageable pageable);
	public Optional<Cliente> findByIdCliente(Long id);
	public Cliente saveCliente(Cliente clie);
	public void deleteByIdCliente(Long id);
	public List<Cliente> findByApodoAndContrasena(String apodo, String contrasena);

	
}
