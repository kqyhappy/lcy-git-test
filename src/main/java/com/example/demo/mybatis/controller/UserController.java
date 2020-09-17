package com.example.demo.mybatis.controller;

import com.example.demo.mybatis.entity.User;
import com.example.demo.mybatis.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user")
//RequestMapping用来映射请求,指定控制器可以处理的URL请求
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //@GetMapping("/users")
    @RequestMapping("/users")         //列出所有的user
    public ModelAndView users() {

        List<User> users = userService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("users",users);
        mv.setViewName("users");
        return mv;
    }

    @RequestMapping("/login")    //登录
    public ModelAndView login(HttpServletRequest request, HttpSession session){
        ModelAndView mv=new ModelAndView();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(username+" "+password);
        User user = userService.findByUsername(username);
        if(user==null){
            mv.addObject("message","no such user");
            mv.setViewName("login");
            return mv;
        }else if(!user.getPassword().equals(password)){
            mv.addObject("message","wrong pass");
            mv.setViewName("login");
            return mv;
        }else{
            mv.addObject("user",user);
            session.setAttribute("user",user);
            mv.setViewName("editArticle");
            return mv;
        }

    }

    @RequestMapping("/follower")
    public ModelAndView follower(HttpServletRequest request, HttpSession session){
        ModelAndView mv=new ModelAndView();
        String username=request.getParameter("username");
        User user = userService.findByUsername(username);
        List<User> followers=userService.findFollowers(user.getId());
        mv.addObject("followers",followers);
        mv.setViewName("users");
        return mv;
    }

    @RequestMapping("/following")
    public ModelAndView following(HttpServletRequest request, HttpSession session){
        ModelAndView mv=new ModelAndView();
        String username=request.getParameter("username");
        User user = userService.findByUsername(username);
        List<User> followings=userService.findFollowers(user.getId());
        mv.addObject("followings",followings);
        mv.setViewName("users");
        return mv;
    }
}


