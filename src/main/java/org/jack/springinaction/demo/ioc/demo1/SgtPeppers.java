package org.jack.springinaction.demo.ioc.demo1;

import org.jack.springinaction.demo.ioc.demo1.face.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @Author: Jack
 * @Date: 2018/9/19 9:36
 * @Component 表明该类会作为组件类，并告知Spring需要为这个类创建bean
 * 就不需要显示的配置SgtPeppers的bean了，交给Spring处理
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title="Sgt,Pepper's Lonely Hearts Club band";
    private String artist="The Beatles";
    @Override
    public void play() {
        System.out.println("Playing "+title+" by"+artist);
    }
}