package cn.niceabc.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class JedisTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.17.124.10");
        jedis.set("baidu", "www.baidu.com");
        System.out.println(jedis.get("baidu"));

        jedis.set("count", "1");
        Transaction tx = jedis.multi();
        tx.incr("count");
        tx.set("baidu", "http://www.baidu.com");
        tx.exec();

        System.out.println(jedis.get("count"));
        System.out.println(jedis.get("baidu"));


        Transaction tx2 = jedis.multi();
        tx2.set("baidu", "xxx.com");
        tx2.incr("count");
        tx2.discard();

        System.out.println(jedis.get("count"));
        System.out.println(jedis.get("baidu"));
    }
}
