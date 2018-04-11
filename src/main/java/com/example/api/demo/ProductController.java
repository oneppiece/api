package com.example.api.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/products")
	public List<Product> products() {
		List<Product> result = new ArrayList<>(10);
		result = productRepository.findAll();
		return result;
	}

	@GetMapping("/products/{id}")
	public Product product(@PathVariable int id) {
		Product result = new Product();
		result = productRepository.getOne(id);
		return result;
	}
}
