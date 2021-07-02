package com.kravchenko.springeshop.service;

import com.kravchenko.springeshop.dto.ProductDTO;

import java.util.List;

public interface ProductService {
	List<ProductDTO> getAll();
	void addToUserBucket(Long productId, String username);
	void addProduct(ProductDTO dto);
	void updateUserBucket(String username);
}
