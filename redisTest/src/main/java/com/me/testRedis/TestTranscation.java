package com.me.testRedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

public class TestTranscation {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        // 监控key，如果该动了事务就被放弃
        /*
         * 3 jedis.watch("serialNum"); jedis.set("serialNum","s#####################");
         * jedis.unwatch();
         */

        Transaction transaction = jedis.multi();// 被当作一个命令进行执行
        Response<String> response = transaction.get("serialNum");
        transaction.set("serialNum", "s002");
        response = transaction.get("serialNum");
        transaction.lpush("list3", "a");
        transaction.lpush("list3", "b");
        transaction.lpush("list3", "c");

        transaction.exec();
        // 2 transaction.discard();
        System.out.println("serialNum***********" + response.get());
    }
}
