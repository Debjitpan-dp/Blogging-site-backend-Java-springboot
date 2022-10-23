package com.debjit.blog.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.debjit.blog.entities.Category;
import com.debjit.blog.entities.Post;
import com.debjit.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	Page<Post> findByUser(Pageable pageable, User user);

	Page<Post> findByCategory(Pageable pageable, Category category);

	List<Post> findByTitleContaining(String title);

}
