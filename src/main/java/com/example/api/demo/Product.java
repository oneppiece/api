package com.example.api.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "products")
@Entity
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer"})
public class Product implements Serializable {

	private static final long serialVersionUID = -6146133859901304047L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "product_name")
	private String productName;

	public Product() {
	}

	public Product(int id,String productName) {
		this.productName = productName;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return com.google.common.base.Objects.toStringHelper(this)
				.add("id", id)
				.add("productName", productName)
				.toString();
	}
}
