package org.jack.springinaction.demo.mvc;

import org.jack.springinaction.demo.mvc.config.RootConfig;
import org.jack.springinaction.demo.mvc.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: Jack
 * @Date: 2018/9/19 14:23
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 返回的带有@Configuration注解的类将会用来配置
     * ContextLoaderListener应用上下文中的bean
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    /**
     * 返回的带有@Configuration注解的类将会用来定义
     * DispatcherServlet应用上下文中的bean
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    /**
     * 将一个或者多个路径映射到DispatcherServlet上
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}