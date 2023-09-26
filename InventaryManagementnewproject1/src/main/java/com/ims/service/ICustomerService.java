package com.ims.service;

import java.util.List;

import com.ims.dto.CustomerDTO;
import com.ims.dto.ProductDTO;
import com.ims.exception.CustomerException;

public interface ICustomerService {
	CustomerDTO addCustomer(CustomerDTO cust)throws CustomerException;
	CustomerDTO updateCustomer(CustomerDTO cust)throws CustomerException;
	CustomerDTO removeCustomer(int id) throws CustomerException;
	CustomerDTO viewCustomer(int id) throws CustomerException;
	List<CustomerDTO> viewAllCustomer();
	public ProductDTO viewProductById(int id);
	public List<ProductDTO> viewAllProducts();


}
