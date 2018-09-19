package org.jack.springinaction.demo.ioc.demo3;

import org.jack.springinaction.demo.ioc.demo3.face.Cold;
import org.jack.springinaction.demo.ioc.demo3.face.Dessert;
import org.springframework.stereotype.Component;

/**
 * @Author: Jack
 * @Date: 2018/9/19 13:32
 */
@Component
@Cold
public class IceCream implements Dessert {

}