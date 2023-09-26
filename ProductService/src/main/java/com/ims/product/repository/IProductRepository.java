package com.ims.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ims.product.dto.ProductDTO;



public interface IProductRepository extends JpaRepository<ProductDTO,Integer>{

}
