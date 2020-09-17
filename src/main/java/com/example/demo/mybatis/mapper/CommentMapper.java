package com.example.demo.mybatis.mapper;

import com.example.demo.mybatis.entity.Comment;

import java.util.List;

public interface CommentMapper {
    void addComment(Comment comment);
    List<Comment> findCommentsByArticleId(int articleId);
}
