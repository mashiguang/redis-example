package cn.niceabc.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class Block1 {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.17.124.10");
        System.out.println(jedis.blpop("comments", "300"));
    }
}
