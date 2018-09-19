package org.jack.springinaction.demo.aop;

import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Jack
 * @Date: 2018/9/18 23:04
 */
public class TrackCounter {
    private Map<Integer,Integer> map=new HashMap<>();
    @Pointcut("execution(* org.jack.springinaction.demo)")
    public void trackPlayed(int trackNumber) {}
}