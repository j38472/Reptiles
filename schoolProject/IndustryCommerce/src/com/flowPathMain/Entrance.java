package com.flowPathMain;

import com.database.linkClose;

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
        linkClose linkClose = new linkClose();


        //关闭数据库的链接
        linkClose.redisClose();
        linkClose.mySqlClose();
    }

}
