package org.jack.springinaction.demo.ioc.demo3;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

/**
 * @Author: Jack
 * @Date: 2018/9/19 13:36
 * 默认Spring应用上下文中所有的bean都是以单列形式创建的
 * Spring定义了四种作用域
 * 单例，在整个应用中，只创建bean的一个实例
 * 原型，每次注入或者通过Spring应用上下文获取时，都会创建一个新的bean的实例
 * 会话，在web应用中，为每个会话创建一个bean实例
 * 请求，在web应用中，为每个请求创建一个bean实例
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad {
    public Notepad notepad() {
        return new Notepad();
    }
}