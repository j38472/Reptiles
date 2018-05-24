package com.database;

import redis.clients.jedis.Jedis;

import java.sql.Statement;
import java.util.ArrayList;

/**
 * 数据库的小功能实现
 */
public class DatabaseUtil {
    //链接数据库
    linkClose linkClose = new linkClose();

    /**
     * 获取规则表规则
     * 以集合<实体类>方式返回
     */
    public void GetRulesAll() {
        Statement statement = linkClose.mySqlLink();

    }


    /**
     * redis去重
     * 接受一个需要去重的集合
     * 返回一个去重后的集合
     */
    public ArrayList redisDe_weight(ArrayList<String> arrayList) {

        Jedis jedis = linkClose.redisLink();
        //声明一个用于存放去重后URL的集合 设置长度为未去重的长度
        ArrayList<String> urlDe_weight = new ArrayList<>(arrayList.size());
        //迭代需要去重的集合
        for (String url : arrayList) {
            //查询数据库中是否含有该数据 没有则返回空
            if (jedis.hget("url", url) == null) {
                urlDe_weight.add(url);
            }
        }
        return urlDe_weight;
    }


    /**
     * 获取规则并以集合方式返回每一组为一个
     */
    public void getRule() {
    }

}
