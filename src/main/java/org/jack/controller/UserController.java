package org.jack.controller;

import org.jack.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @Author: Jack
 * @Date: 2018/9/18 15:16
 */
@Controller
@RequestMapping(value = "/loginForm")
public class UserController {
    @RequestMapping(value = "/login")
    public ModelAndView login(String loginname, String password,HttpSession session) {
        ModelAndView mv=new ModelAndView();
        if (loginname!=null&&loginname.equals("jack")
                &&password!=null&&password.equals("123456")) {
            User user=new User();
            user.setLoginname(loginname);
            user.setPassword(password);
            user.setUsername("管理员");
            session.setAttribute("user",user);
            mv.setViewName("redirect:main");
        } else {
            mv.addObject("message","登录名或密码错误，请重新输入");
            mv.setViewName("loginForm");
        }
        return mv;
    }
}