package org.jack.springinaction.demo.ioc.demo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jack
 * @Date: 2018/9/19 9:45
 * @ComponentScan 这个注解能够在Spring中启用组件扫描
 * 如果没有其他配置，@ComponentScan默认会扫描与配置类相同的包，会扫描包以及包下
 * 的所有的子包，查找带有@Component注解的类
 * @Configuration 表明这个类时一个配置类，应该包含在Spring应用上下文中
 * 如何创建bean的细节。
 */
@Configuration
@ComponentScan(basePackages = "org.jack.springinaction.demo.ioc")
public class CDPlayerConfig {
}