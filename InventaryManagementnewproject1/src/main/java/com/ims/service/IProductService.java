package com.ims.service;

import java.util.List;

import com.ims.dto.ProductDTO;
import com.ims.exception.ProductException;

public interface IProductService {
	public ProductDTO addProduct(ProductDTO product) throws ProductException;
	public ProductDTO updateProduct(ProductDTO product) throws ProductException;
	public ProductDTO deleteProduct(Integer id) throws ProductException;
	public ProductDTO getProductById(Integer id) throws ProductException;
	public List<ProductDTO> getAllProducts();

}
