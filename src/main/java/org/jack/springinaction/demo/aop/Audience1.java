package org.jack.springinaction.demo.aop;

import org.aspectj.lang.annotation.*;

/**
 * @Author: Jack
 * @Date: 2018/9/18 22:34
 */
@Aspect
public class Audience1 {
    /**
     * '*'开始，表明不关心方法的返回值类型
     * (..)表明切点要选择任意的perform方法
     * 无论该方法的形参是什么，
     * execution()指示器选择类名以及对应的方法
     */
    @Pointcut("execution(** org.jack.springinaction.demo.Performance.perform(..))")
    public void performance(){}
    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }
    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP");
    }
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demand a refund");
    }
}