package com.database;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 数据库的链接与关闭
 * 目前想法：将数据库的链接设计成单例
 * redis 是使用的非切链接池子
 */
public class LinkClose {
    private static Connection conn = null;
    private static Statement st = null;

    /**
     * MySql链接
     */
    public Statement mySqlLink() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/reptiletentative";
        String user = "root";
        String password = "root";
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                System.err.print("链接MySql数据库失败");
                e.printStackTrace();
            }
        }
        if (st == null) {
            try {
                st = conn.createStatement();
            } catch (Exception e) {
                System.err.print("转换Statement格式失败");
                e.printStackTrace();
            }
        }
        return st;
    }

    /**
     * MySql关闭
     */
    public void mySqlClose() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
            if (st != null) {
                st.close();
                st = null;
            }
            System.out.print("MySql数据库已关闭");
        } catch (Exception e) {
            System.err.print("关闭MySql链接失败");
            e.printStackTrace();
        }
    }

    private static Jedis jedis;//非切片客户端链接
    private static JedisPool jedisPool;//非切片链接池


    /**
     * Redis链接
     */
    public Jedis redisLink() {
        if (jedis == null) {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(20);//最大链接数
            config.setMaxIdle(5);//最大空闲数
            config.setMaxWaitMillis(1000 * 10);
            config.setTestOnBorrow(false);
//            jedisPool = new JedisPool(config, "localhost", 6379);
//            jedis = jedisPool.getResource();
            jedis = new JedisPool(config, "localhost", 6379).getResource();
        }
        return jedis;
    }

    /**
     * Redis关闭
     */
    public void redisClose() {
        if (jedis != null) {
            jedis.close();
            jedis = null;
        }
        if (jedisPool != null) {
            jedisPool.close();
            jedisPool = null;
        }
    }

    public static void main(String[] arg) {

    }
}
