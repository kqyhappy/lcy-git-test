package com.example.demo.mybatis.service;
import com.example.demo.mybatis.entity.Article;
import com.example.demo.mybatis.entity.Comment;
import java.util.List;

/**
 * Created by 20372 on 2020/9/13.
 */
public interface ArticleService {


    List<Comment> findCommentsByArticleId(int articleId);

    void addComment(Comment comment);

    void addText(Article article);

    Article findText(int articleId);
}
