package org.jack.springinaction.demo.ioc.demo1;

import org.jack.springinaction.demo.ioc.demo1.face.CompactDisc;
import org.jack.springinaction.demo.ioc.demo1.face.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Jack
 * @Date: 2018/9/19 10:20
 * @Autowired 不仅能够用在构造器上，还可以用在setter方法上或者其他
 * 方法上，Spring都会尝试满足方法参数上所声明的依赖。
 * 加入假如只有一个bean匹配依赖需求，这个bean就会被装配。
 * 如果没有匹配的bean，在应用上下文创建时会抛出异常，为了避免
 * 抛出异常，给@Autowired加上参数为false。
 * 如果有多个bean能够满足依赖关系，Spring会抛出异常，表明没有
 * 明确指定需要哪个bean进行自动装配
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;
    @Autowired(required = false)
    public CDPlayer(CompactDisc cd) {
        this.cd=cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}