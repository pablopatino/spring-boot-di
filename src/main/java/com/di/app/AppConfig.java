package com.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.di.app.models.domain.ItemFactura;
import com.di.app.models.domain.Producto;

@Configuration
public class AppConfig {

	@Bean("itemFactura")
	public List<ItemFactura> registrarItems() {

		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Camara Sony2", 200);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);

		return Arrays.asList(linea1, linea2);
	}

	
	@Primary
	@Bean("itemsOficina")
	public List<ItemFactura> registrarItemsOficina() {

		Producto producto1 = new Producto("Monitor", 250);
		Producto producto2 = new Producto("Mouse", 300);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);

		return Arrays.asList(linea1, linea2);
	}
}
