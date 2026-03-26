package com.bolsadeideas.springboot.webflux.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.webflux.models.dao.ProductoDao;
import com.bolsadeideas.springboot.webflux.models.entity.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoDao dao;
	@Override
	public Flux<Producto> findall() {
		
		return dao.findAll();
	}

	@Override
	public Mono<Producto> findById(String id) {
		
		return dao.findById(id);
	}

	@Override
	public Mono<Producto> save(Producto producto) {
		
		return dao.save(producto);
	}

	@Override
	public void delete(Producto producto) {
		dao.delete(producto);
		
		
	}

}
