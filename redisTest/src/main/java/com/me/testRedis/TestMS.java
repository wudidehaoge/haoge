package com.me.testRedis;

import redis.clients.jedis.Jedis;

public class TestMS {
    public static void main(String[] args) {
        String host1 = "127.0.0.1";
        String host2 = "172.19.246.205";
        Jedis jedis_M = new Jedis(host2, 6379);
        Jedis jedis_S = new Jedis(host2, 6380);

        jedis_S.slaveof(host2, 6379);

        jedis_M.set("class", "1188");

        String result = jedis_S.get("class");//可能有延迟，需再次启动才能使用
        System.out.println(result);
    }
}
