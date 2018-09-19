package org.jack.springinaction.demo.ioc.demo3;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Jack
 * @Date: 2018/9/19 13:47
 */
public class StoreService {
    public ShoppingCart shoppingCart;
    @Autowired
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}