package org.jack.springinaction.demo.ioc.demo3;

import org.springframework.context.annotation.Conditional;

/**
 * @Author: Jack
 * @Date: 2018/9/19 13:10
 */
@Conditional(MagicExistsCondition.class)
public class MagicBean {
    public MagicBean magicBean() {
        return new MagicBean();
    }
}