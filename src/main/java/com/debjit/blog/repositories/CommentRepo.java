package com.debjit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debjit.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
