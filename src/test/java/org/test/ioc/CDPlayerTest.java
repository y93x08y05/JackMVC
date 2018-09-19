package org.test.ioc;

import org.jack.springinaction.demo.ioc.demo1.CDPlayerConfig;
import org.jack.springinaction.demo.ioc.demo1.face.CompactDisc;
import org.jack.springinaction.demo.ioc.demo1.face.MediaPlayer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Jack
 * @Date: 2018/9/19 9:52
 */
//SpringJUnit4ClassRunner使得在测试开始的时候自动创建Spring的应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
//告知需要在CDPlayerConfig中加载配置
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final SystemOutRule systemOutRule=new SystemOutRule();
    @Autowired
    private MediaPlayer player;
    @Autowired
    CompactDisc cd;
    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }
    @Test
    public void play() {
        player.play();
        Assert.assertEquals("Playing Sgt, Pepper's Lonely Hearts Club Band"+
                " by The Beatles\n",systemOutRule.getLog());
    }
}