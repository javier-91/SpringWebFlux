package com.bolsadeideas.springboot.webflux.models.services;

import com.bolsadeideas.springboot.webflux.models.entity.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {
	
	public Flux<Producto> findall();
	
	public Mono<Producto> findById(String id);
	
	public Mono<Producto> save (Producto producto);
	
	public void delete (Producto producto);

}
