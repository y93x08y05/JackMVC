package org.jack.springinaction.demo.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: Jack
 * @Date: 2018/9/19 14:37
 */
@Configuration
@ComponentScan(basePackages = {"org.jack.springinaction.demo.mvc"},
    excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
}