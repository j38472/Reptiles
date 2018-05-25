package com.test;

import com.database.LinkClose;
import com.pojo.*;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TestSql {

    //创建链接数据库类对象
    LinkClose linkClose = new LinkClose();
    //获取数据库statement实体
    Statement statement = linkClose.mySqlLink();

    public static void main(String[] arg) {
        TestSql testSql = new TestSql();
        testSql.getRulesAll();
        testSql.linkClose.mySqlClose();

    }

    /**
     * 获取主页面URL与地区分类
     */
    public ArrayList<ProvinceWebUrl> getProvinceweburlAll() {
        ArrayList<ProvinceWebUrl> provinceWebUrlArrayList = new ArrayList<>();
        String provinceWebUrlAllSql = "";
        try {
            ResultSet resultSet =statement.executeQuery(provinceWebUrlAllSql);
            while (resultSet.next()){//指向下一种一个指针
                //取数据
                int id = resultSet.getInt("id");
                String mainweb = resultSet.getString("mainweb");
                String province = resultSet.getString("province");
                provinceWebUrlArrayList.add(new ProvinceWebUrl());
            }
        } catch (Exception e) {

        }

        return provinceWebUrlArrayList;
    }

    /**
     * 获取关键字
     */
    public ArrayList<KeyWords> getKeyWordAll() {
        ArrayList<KeyWords> keyWordsArrayList = new ArrayList<KeyWords>();

        String keyWordAllSql = "";//取规则的SQL语句
        try {
            ResultSet resultSet = statement.executeQuery(keyWordAllSql);
            while (resultSet.next()) {//指向下一种一个指针
                //取id与Keyword
                int id = resultSet.getInt("id");
                String keyWord = resultSet.getString("Keyword");
                //存入集合
                keyWordsArrayList.add(new KeyWords(id, keyWord));
            }
        } catch (Exception e) {
            System.err.print("取数据库KeyWords表失败了！！！！");
        }
        return keyWordsArrayList;
    }


    /**
     * 获取规则表规则
     * 以集合<实体类>方式返回
     */
    public ArrayList<Website> getRulesAll() {
        ArrayList<Website> arrayList = new ArrayList<Website>();
        String websiteSql = "SELECT * FROM website";//取规则的SQL语句
        try {
            ResultSet resultSet = statement.executeQuery(websiteSql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");//数量
                int pid = resultSet.getInt("pid");// 关联主网站id
                String crawerurl = resultSet.getString("crawerurl");//入口
                String urlrule = resultSet.getString("urlrule");//url规则
                String preurl = resultSet.getString("preurl");//拼接URL
                String pageone = resultSet.getString("pageone");//子页面首页的URL
                String bid_numrule = resultSet.getString("bid_numrule");//招标编号规则
                String tend_namerule = resultSet.getString("tend_namerule");//招标名称规则
                String tdreerule = resultSet.getString("tdreerule");//招标人规则
                String bagencyrule = resultSet.getString("bagencyrule");//招标代理机构规则
                String btyperule = resultSet.getString("btyperule");//招标方式规则
                String tdcontrule = resultSet.getString("tdcontrule");//招标内容规则
                String capsorrule = resultSet.getString("capsorrule");//资金来源规则
                String bgetrule = resultSet.getString("bgetrule");//预算金额规则
                String tplacerule = resultSet.getString("tplacerule");//招标地点规则
                String valibrule = resultSet.getString("valibrule");//投标截止日期规则
                String qreqrule = resultSet.getString("qreqrule");//投标资格要求规则
                String actdrule = resultSet.getString("actdrule");//获取招标文件方式规则
                String valiprerule = resultSet.getString("valiprerule");//招标截止日期规则
                String bopentrule = resultSet.getString("bopentrule");//开标时间规则
                String opplacerule = resultSet.getString("opplacerule");//开标地点规则
                String lmrule = resultSet.getString("lmrule");//联系人规则
                String phonerule = resultSet.getString("phonerule");//电话规则
                String fmrule = resultSet.getString("fmrule");//传真规则
                String daterule = resultSet.getString("daterule");//日期规则
                int state = resultSet.getInt("state");//  是否采集1是，2 否
                int issearcher = resultSet.getInt("issearcher");//  是否为站内搜索　　0 不是　　１　是
                int urlwebtype = resultSet.getInt("urlwebtype");// 列表页： 1静态 2异步　1 表示静态　　2表示异步加载
                int ruletype = resultSet.getInt("ruletype");//采集规则:1为selenium 2为jsoup
                int startenum = resultSet.getInt("startenum");//判断以0或1开始
                int contentwebtype = resultSet.getInt("contentwebtype");// 内容页： 1静态 2异步
                int pagenum = resultSet.getInt("pagenum");//  采集页数
                String allcontentrule = resultSet.getString("allcontentrule");//采集全部内容
                int contenttype = resultSet.getInt("contenttype");//判断是否按规则采集1.是2.否（采集全部内容）
                String pagenextxpath = resultSet.getString("pagenextxpath");// 下一页xpath规则
                String pagenextcss = resultSet.getString("pagenextcss");// 下一页css规则

                arrayList.add(new Website(id, pid, crawerurl, urlrule, preurl, pageone, bid_numrule, tend_namerule, tdreerule, bagencyrule,
                        btyperule, tdcontrule, capsorrule, bgetrule, tplacerule, valibrule, qreqrule, actdrule, valiprerule, bopentrule,
                        opplacerule, lmrule, phonerule, fmrule, daterule, state, issearcher, urlwebtype, ruletype, startenum, contentwebtype,
                        pagenum, allcontentrule, contenttype, pagenextxpath, pagenextcss
                ));
            }
        } catch (Exception e) {
            System.err.print("取数据库website表失败了！！！！");
            e.printStackTrace();
        }
        return arrayList;
    }


}

