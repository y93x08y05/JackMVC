package org.test.dao;

import redis.clients.jedis.Jedis;

/**
 * Created by zhangta on 1/11/2018.
 */
public class redisConnection {
    public static void main(String args[]){
        Jedis test = new Jedis("127.0.0.1",6379);
        test.set("hw","hello world");
        String hello = test.get("hw");
        System.out.println(hello);
    }
}
