package org.jack.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: Jack
 * @Date: 2018/9/17 15:44
 */
@Controller
public class HelloController {
    private static final Log logger=LogFactory.getLog(HelloController.class);
    @RequestMapping(value="/hello")
    public ModelAndView hello() {
        logger.info("hello方法被调用");
        ModelAndView mv=new ModelAndView();
        mv.addObject("message","Hello World");
        mv.setViewName("index.html");
        return mv;
    }
}