package org.jack.springinaction.demo.ioc.demo3;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: Jack
 * @Date: 2018/9/19 13:09
 */
public class MagicExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env=context.getEnvironment();
        return env.containsProperty("magic");
    }
}