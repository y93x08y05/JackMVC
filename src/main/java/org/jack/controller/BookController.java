package org.jack.controller;

import org.jack.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jack
 * @Date: 2018/9/18 15:22
 */
@Controller
public class BookController {
    @RequestMapping(value = "/main")
    public String main(Model model) {
        List<Book> list=new ArrayList<>();
        list.add(new Book("疯狂Java讲义","李刚","74"));
        list.add(new Book("疯狂C++讲义","李刚","56"));
        list.add(new Book("疯狂C#讲义","李刚","39"));
        list.add(new Book("疯狂Python讲义","李刚","27"));
        model.addAttribute("list",list);
        return "main";
    }
}