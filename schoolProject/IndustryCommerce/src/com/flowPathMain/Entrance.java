package com.flowPathMain;

import java.util.ArrayList;

import com.database.LinkClose;
import com.pojo.*;
import com.test.*;

/**
 * 程序入口
 */
public class Entrance {
    /**
     * 思路：
     * 先获取规则表 并存入集合中
     * 判断这个集合元素是否要爬
     * 然后把规则放入集合中
     * 进入主界面判断同步异步
     * 异步处理
     * 根据规则爬数据URL
     * 没爬到就换规则再爬一次
     * URL去重
     * 根据URL进入二级页面
     * 判断同步异步
     * 异步处理
     * 根据规则爬数据
     * 存数据
     * 存URL
     */
    public static void main(String[] arg) {
        TestSql testSql = new TestSql();
        //获取全部规则的数据集合
        ArrayList<Website> arrayListWebsite = testSql.getRulesAll();
        //获取主页面入口URL以及此URL对应的地域
        ArrayList<ProvinceWebUrl> provinceWebUrlArrayList = testSql.getProvinceweburlAll();
        //迭代这个集合
        for (Website Website : arrayListWebsite) {
            //首先判断这个页面是否要采集
            if (Website.getState() == 1) {
                //判断是否为站内搜索
                if (Website.getIssearcher() == 1) {//站内采集


                } else {//非站内采集

                }
            } else {
                System.out.print("这个页面不需要采集!");
            }
        }

        LinkClose linkClose = new LinkClose();
        linkClose.mySqlClose();
        linkClose.redisClose();
    }

}
