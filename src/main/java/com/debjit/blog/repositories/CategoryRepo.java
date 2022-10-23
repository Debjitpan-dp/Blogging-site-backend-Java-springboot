package com.debjit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debjit.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

	
}
