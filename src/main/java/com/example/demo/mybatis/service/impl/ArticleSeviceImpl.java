package com.example.demo.mybatis.service.impl;

import com.example.demo.mybatis.entity.Article;
import com.example.demo.mybatis.entity.Comment;
import com.example.demo.mybatis.mapper.ArticleMapper;
import com.example.demo.mybatis.mapper.CommentMapper;
import com.example.demo.mybatis.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/articleService")
public class ArticleSeviceImpl implements ArticleService{
    private ArticleMapper articleMapper;
    private CommentMapper commentMapper;
    @Autowired
    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @Autowired
    public void setCommentMapper(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }


    @Override
    public void addText(Article article) {
         articleMapper.addText(article);
    }

    @Override
    public Article findText(int articleId){
        Article article =articleMapper.findText(articleId);
        System.out.println(article.getArticleId()+" "+article.getArticleTitle()+"  "+article.getArticleText());
        return article;

    }

    @Override
    public void addComment(Comment comment){
        commentMapper.addComment(comment);
    }

    @Override
    public List<Comment> findCommentsByArticleId(int articleId){
        return commentMapper.findCommentsByArticleId(articleId);
    }
}
