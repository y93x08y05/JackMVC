package org.jack.springinaction.demo.ioc.demo3.face;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Jack
 * @Date: 2018/9/19 13:30
 */
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,
ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Cold {
}
