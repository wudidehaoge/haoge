package com.me.testRedis;

import redis.clients.jedis.Jedis;

public class TestPing {
    public static void main(String[] args)
    {
        String host = "127.0.0.1";
        Jedis jedis = new Jedis(host,6379);
        //输出PONG，redis连通成功
        System.out.println(jedis.ping());
    }
}
