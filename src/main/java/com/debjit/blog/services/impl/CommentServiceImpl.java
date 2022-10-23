package com.debjit.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.debjit.blog.entities.Comment;
import com.debjit.blog.entities.Post;
import com.debjit.blog.exceptions.ResourceNotFoundException;
import com.debjit.blog.payloads.CommentDto;
import com.debjit.blog.repositories.CommentRepo;
import com.debjit.blog.repositories.PostRepo;
import com.debjit.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private  PostRepo postRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post = this.postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "post Id", postId));
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		
		comment.setPost(post);
		
		Comment savedComment = this.commentRepo.save(comment);
		
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {

		Comment comment = this.commentRepo.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("comment", "comment Id", commentId));
		this.commentRepo.delete(comment);

	}

}
