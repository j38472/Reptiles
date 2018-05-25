package com.database;

import redis.clients.jedis.Jedis;

import com.pojo.*;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 数据库的小功能实现
 */
public class DatabaseUtil {
    //创建链接数据库类对象
    LinkClose LinkClose = new LinkClose();

    /**
     * 获取规则表规则
     * 以集合<实体类>方式返回
     */
    public void GetRulesAll() {
        ArrayList<Website> arrayList = new ArrayList<Website>();
        Statement statement = LinkClose.mySqlLink();
        String websiteSql = "";//取规则的SQL语句
        try {
            ResultSet resultSet = statement.executeQuery(websiteSql);
            resultSet.getInt("id");//数量
            resultSet.getInt("pid");// 关联主网站id
            resultSet.getString("crawerurl");//入口
            resultSet.getString("urlrule");//url规则
            resultSet.getString("preurl");//拼接URL
            resultSet.getString("pageone");//子页面首页的URL
            resultSet.getString("bid_numrule");//招标编号规则
            resultSet.getString("tend_namerule");//招标名称规则
            resultSet.getString("tdreerule");//招标人规则
            resultSet.getString("bagencyrule");//招标代理机构规则
            resultSet.getString("btyperule");//招标方式规则
            resultSet.getString("tdcontrule");//招标内容规则
            resultSet.getString("capsorrule");//资金来源规则
            resultSet.getString("bgetrule");//预算金额规则
            resultSet.getString("tplacerule");//招标地点规则
            resultSet.getString("valibrule");//投标截止日期规则
            resultSet.getString("qreqrule");//投标资格要求规则
            resultSet.getString("actdrule");//获取招标文件方式规则
            resultSet.getString("valiprerule");//招标截止日期规则
            resultSet.getString("bopentrule");//开标时间规则
            resultSet.getString("opplacerule");//开标地点规则
            resultSet.getString("lmrule");//联系人规则
            resultSet.getString("phonerule");//电话规则
            resultSet.getString("fmrule");//传真规则
            resultSet.getString("daterule");//日期规则
            resultSet.getInt("state");//  是否采集1是，2 否
            resultSet.getInt("issearcher");//  是否为站内搜索　　0 不是　　１　是
            resultSet.getInt("urlwebtype");// 列表页： 1静态 2异步　1 表示静态　　2表示异步加载
            resultSet.getInt("ruletype");//采集规则:1为selenium 2为jsoup
            resultSet.getInt("startenum");//判断以0或1开始
            resultSet.getInt("contentwebtype");// 内容页： 1静态 2异步
            resultSet.getInt("pagenum");//  采集页数
            resultSet.getString("allcontentrule");//采集全部内容
            resultSet.getInt("contenttype");//判断是否按规则采集1.是2.否（采集全部内容）
            resultSet.getString("pagenextxpath");// 下一页xpath规则
            resultSet.getString("pagenextcss");// 下一页css规则

        } catch (Exception e) {
            System.err.print("取数据库的规则数据失败了");
            e.printStackTrace();
        }


    }


    /**
     * redis去重
     * 接受一个需要去重的集合
     * 返回一个去重后的集合
     */
    public ArrayList redisDe_weight(ArrayList<String> arrayList) {
        Jedis jedis = LinkClose.redisLink();
        //声明一个用于存放去重后URL的集合 设置长度为未去重的长度
        ArrayList<String> urlDe_weight = new ArrayList<>(arrayList.size());
        //迭代需要去重的集合
        for (String url : arrayList) {
//            if (jedis.hget("url", url) == null) {
//                urlDe_weight.add(url);
//            }
            //查询数据库中是否含有该数据
            if (!jedis.exists(url)) {
                urlDe_weight.add(url);
            }
        }
        return urlDe_weight;
    }

    /**
     * 向Redis存储URL
     */
    public void redisCreateUrl(String url) {
        Jedis jedis = LinkClose.redisLink();
        //设置时间格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //存入数据与存入时间
        jedis.set(url, dateFormat.format(new Date()));
    }

    /**
     * 获取规则并以集合方式返回每一组为一个
     */
    public void getRule() {
    }

}
