package com.ims.service;

import java.util.List;

import com.ims.dto.CategoryDto;
import com.ims.exception.CategoryException;

public interface ICategoryService {
	public CategoryDto addCategory(CategoryDto cat) throws CategoryException;
	public CategoryDto updateCategory(CategoryDto cat) throws CategoryException;
	public CategoryDto removeCategory(Integer catId)throws CategoryException;
	public CategoryDto viewCategory(Integer catId) throws CategoryException;
	public List<CategoryDto> viewAllCategory() throws CategoryException;

}
