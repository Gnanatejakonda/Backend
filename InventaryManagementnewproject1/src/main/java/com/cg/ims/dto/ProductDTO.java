package com.cg.ims.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ims_product")
public class ProductDTO {
	@Id
	int  productId;
	@Column(name="name")
	private String name;
	@Column(name="charges")
	private float charges;
	@Column(name="quantity")
	private Long quantity;
	@Column(name="category")
	private String category;
	@Column(name="size")
	private String size;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
		
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
}

