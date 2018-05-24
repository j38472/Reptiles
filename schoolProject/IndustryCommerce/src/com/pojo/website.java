package com.pojo;

/**
 * 规则表的实体类
 */
public class website {
    private int id = 0;//数量
    private int pid = 0;// 关联主网站id
    private String crawerurl = null;//入口
    private String urlrule = null;//url规则
    private String preurl = null;//拼接URL
    private String pageone = null;//子页面首页的URL
    private String bid_numrule = null;//招标编号规则
    private String tend_namerule = null;//招标名称规则
    private String tdreerule = null;//招标人规则
    private String bagencyrule = null;//招标代理机构规则
    private String btyperule = null;//招标方式规则
    private String tdcontrule = null;//招标内容规则
    private String capsorrule = null;//资金来源规则
    private String bgetrule = null;//预算金额规则
    private String tplacerule = null;//招标地点规则
    private String valibrule = null;//投标截止日期规则
    private String qreqrule = null;//投标资格要求规则
    private String actdrule = null;//获取招标文件方式规则
    private String valiprerule = null;//招标截止日期规则
    private String bopentrule = null;//开标时间规则
    private String opplacerule = null;//开标地点规则
    private String lmrule = null;//联系人规则
    private String phonerule = null;//电话规则
    private String fmrule = null;//传真规则
    private String daterule = null;//日期规则
    private int state = 0;//  是否采集1是，2 否
    private int issearcher = 0;//  是否为站内搜索　　0 不是　　１　是
    private int urlwebtype = 0;// 列表页： 1静态 2异步　1 表示静态　　2表示异步加载
    private int ruletype = 0;//采集规则:1为selenium 2为jsoup
    private int startenum = 0;//判断以0或1开始
    private int contentwebtype = 0;// 内容页： 1静态 2异步
    private int pagenum = 0;//  采集页数
    private String allcontentrule = null;//采集全部内容
    private int contenttype = 0;//判断是否按规则采集1.是2.否（采集全部内容）
    private String pagenextxpath = null;// 下一页xpath规则
    private String pagenextcss = null;// 下一页css规则

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getCrawerurl() {
        return crawerurl;
    }

    public void setCrawerurl(String crawerurl) {
        this.crawerurl = crawerurl;
    }

    public String getUrlrule() {
        return urlrule;
    }

    public void setUrlrule(String urlrule) {
        this.urlrule = urlrule;
    }

    public String getPreurl() {
        return preurl;
    }

    public void setPreurl(String preurl) {
        this.preurl = preurl;
    }

    public String getPageone() {
        return pageone;
    }

    public void setPageone(String pageone) {
        this.pageone = pageone;
    }

    public String getBid_numrule() {
        return bid_numrule;
    }

    public void setBid_numrule(String bid_numrule) {
        this.bid_numrule = bid_numrule;
    }

    public String getTend_namerule() {
        return tend_namerule;
    }

    public void setTend_namerule(String tend_namerule) {
        this.tend_namerule = tend_namerule;
    }

    public String getTdreerule() {
        return tdreerule;
    }

    public void setTdreerule(String tdreerule) {
        this.tdreerule = tdreerule;
    }

    public String getBagencyrule() {
        return bagencyrule;
    }

    public void setBagencyrule(String bagencyrule) {
        this.bagencyrule = bagencyrule;
    }

    public String getBtyperule() {
        return btyperule;
    }

    public void setBtyperule(String btyperule) {
        this.btyperule = btyperule;
    }

    public String getTdcontrule() {
        return tdcontrule;
    }

    public void setTdcontrule(String tdcontrule) {
        this.tdcontrule = tdcontrule;
    }

    public String getCapsorrule() {
        return capsorrule;
    }

    public void setCapsorrule(String capsorrule) {
        this.capsorrule = capsorrule;
    }

    public String getBgetrule() {
        return bgetrule;
    }

    public void setBgetrule(String bgetrule) {
        this.bgetrule = bgetrule;
    }

    public String getTplacerule() {
        return tplacerule;
    }

    public void setTplacerule(String tplacerule) {
        this.tplacerule = tplacerule;
    }

    public String getValibrule() {
        return valibrule;
    }

    public void setValibrule(String valibrule) {
        this.valibrule = valibrule;
    }

    public String getQreqrule() {
        return qreqrule;
    }

    public void setQreqrule(String qreqrule) {
        this.qreqrule = qreqrule;
    }

    public String getActdrule() {
        return actdrule;
    }

    public void setActdrule(String actdrule) {
        this.actdrule = actdrule;
    }

    public String getValiprerule() {
        return valiprerule;
    }

    public void setValiprerule(String valiprerule) {
        this.valiprerule = valiprerule;
    }

    public String getBopentrule() {
        return bopentrule;
    }

    public void setBopentrule(String bopentrule) {
        this.bopentrule = bopentrule;
    }

    public String getOpplacerule() {
        return opplacerule;
    }

    public void setOpplacerule(String opplacerule) {
        this.opplacerule = opplacerule;
    }

    private String charset = null;//    页面编码格式


}
