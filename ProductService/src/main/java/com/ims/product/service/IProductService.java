package com.ims.product.service;

import java.util.List;

import com.ims.product.dto.ProductDTO;
import com.ims.product.exception.ProductException;
import com.ims.product.exception.ProductNotFoundException;

public interface IProductService {
	public ProductDTO addProduct(ProductDTO product) throws ProductException;
	public ProductDTO updateProduct(ProductDTO product) throws ProductException;
	public ProductDTO deleteProduct(Integer id) throws ProductException;
	public ProductDTO getProductById(Integer id) throws ProductException;
	public List<ProductDTO> getAllProducts();
	public ProductDTO viewProductById(int id) throws ProductNotFoundException;



}
