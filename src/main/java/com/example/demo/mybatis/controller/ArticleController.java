package com.example.demo.mybatis.controller;

import com.example.demo.mybatis.entity.Article;
import com.example.demo.mybatis.entity.Tag;
import com.example.demo.mybatis.service.ArticleService;
import com.example.demo.mybatis.service.TagService;
import com.example.demo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 20372 on 2020/9/13.
 */
@RestController
@RequestMapping("/article")
public class ArticleController {


    private ArticleService articleService;
    private UserService userService;
    private TagService tagService;
    @Autowired
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Autowired
    public void setUserService(UserService userService){ this.userService=userService; }

    @Autowired
    public void setTagService(TagService tagService){this.tagService=tagService;}

   @RequestMapping("/markdown")
    public ModelAndView article() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("showArticle");
        return mv;
    }

    @RequestMapping("/show")
    public ModelAndView showArticle() {
        Article article = articleService.findText(1);
        System.out.println(article.getArticleText());
        ModelAndView mv = new ModelAndView();
        mv.addObject("article",article);
        mv.setViewName("showArticle");
        return mv;
    }

    @RequestMapping("/addText")
    public ModelAndView article(HttpServletRequest request, HttpSession session) {

        String content = request.getParameter("content");
        String username=request.getParameter("author");
        String tagName=request.getParameter("tag");
        String articleTitle = request.getParameter("title");
        int userId =userService.findIDByName(username);

        Article article = new Article();
        article.setUserId(userId);
        article.setArticleText(content);
        article.setArticleTitle(articleTitle);
        article.setTag(tagName);
        articleService.addText(article);

        if(!tagService.findTag(tagName)){
            Tag tag = new Tag();
            tag.setTagName(tagName);
            tagService.addTag(tag);
        }

        ModelAndView mv = new ModelAndView();
        mv.setViewName("editArticle");
        return mv;
    }


}
