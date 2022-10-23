package com.debjit.blog.services;

import java.util.List;

import com.debjit.blog.payloads.PostDto;
import com.debjit.blog.payloads.PostResponse;

public interface PostService {

	//create
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	// delete
	void deletePost(Integer postId);
	
	// get all posts
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	// get single post
	
	PostDto getPostById(Integer postId);
	
	// get all posts by category
	
	PostResponse getPostsByCategory(Integer categoryId, Integer pageNumber, Integer pageSize);
	
	// get all posts by user
	
	PostResponse getPostsByUser(Integer userId, Integer pageNumber, Integer pageSize);
	
	// Search Posts
	List<PostDto> searchPosts(String keyword);

	
}
