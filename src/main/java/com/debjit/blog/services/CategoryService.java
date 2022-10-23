package com.debjit.blog.services;

import java.util.List;

import com.debjit.blog.payloads.CategoryDto;

public interface CategoryService {

	// Create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// delete
	void deleteCategory(Integer categoryId);
	
	// get
	CategoryDto getCategory(Integer categoryId);
	
	// get all
	List<CategoryDto> getCategories();
}
