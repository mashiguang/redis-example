package cn.niceabc.jedis;

import redis.clients.jedis.Jedis;

public class Block2 {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.17.124.10");
        jedis.lpush("comments", "hello, how are you.");
    }
}
