package org.jack.springinaction.demo.ioc.demo3;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Author: Jack
 * @Date: 2018/9/19 13:45
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.INTERFACES)
public class ShoppingCart {
    public ShoppingCart cart() {
        return new ShoppingCart();
    }
}