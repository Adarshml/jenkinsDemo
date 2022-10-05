package com.samples.productservice.exceptions;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException(int id) {
		super("Product with id " + id + " not found.");
	}

}