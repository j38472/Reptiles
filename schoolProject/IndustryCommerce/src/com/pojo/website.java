package com.pojo;

/**
 * 规则表的实体类
 */
public class Website {
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

    public Website() {//无参构造
    }


    public Website(
            int id,
            int pid,
            String crawerurl,
            String urlrule,
            String preurl,
            String pageone,
            String bid_numrule,
            String tend_namerule,
            String tdreerule,
            String bagencyrule,
            String btyperule,
            String tdcontrule,
            String capsorrule,
            String bgetrule,
            String tplacerule,
            String valibrule,
            String qreqrule,
            String actdrule,
            String valiprerule,
            String bopentrule,
            String opplacerule,
            String lmrule,
            String phonerule,
            String fmrule,
            String daterule,
            int state,
            int issearcher,
            int urlwebtype,
            int ruletype,
            int startenum,
            int contentwebtype,
            int pagenum,
            String allcontentrule,
            int contenttype,
            String pagenextxpath,
            String pagenextcss
    ) {//有参构造
        this.id = id;
        this.pid = pid;
        this.crawerurl = crawerurl;
        this.urlrule = urlrule;
        this.preurl = preurl;
        this.pageone = pageone;
        this.bid_numrule = bid_numrule;
        this.tend_namerule = tend_namerule;
        this.tdreerule = tdreerule;
        this.bagencyrule = bagencyrule;
        this.btyperule = btyperule;
        this.tdcontrule = tdcontrule;
        this.capsorrule = capsorrule;
        this.bgetrule = bgetrule;
        this.tplacerule = tplacerule;
        this.valibrule = valibrule;
        this.qreqrule = qreqrule;
        this.actdrule = actdrule;
        this.valiprerule = valiprerule;
        this.bopentrule = bopentrule;
        this.opplacerule = opplacerule;
        this.lmrule = lmrule;
        this.phonerule = phonerule;
        this.fmrule = fmrule;
        this.daterule = daterule;
        this.state = state;
        this.issearcher = issearcher;

        this.urlwebtype = urlwebtype;
        this.ruletype = ruletype;
        this.startenum = startenum;
        this.contentwebtype = contentwebtype;
        this.pagenum = pagenum;
        this.allcontentrule = allcontentrule;
        this.contenttype = contenttype;
        this.pagenextxpath = pagenextxpath;
        this.pagenextcss = pagenextcss;


    }

    public String getLmrule() {
        return lmrule;
    }

    public void setLmrule(String lmrule) {
        this.lmrule = lmrule;
    }

    public String getPhonerule() {
        return phonerule;
    }

    public void setPhonerule(String phonerule) {
        this.phonerule = phonerule;
    }

    public String getFmrule() {
        return fmrule;
    }

    public void setFmrule(String fmrule) {
        this.fmrule = fmrule;
    }

    public String getDaterule() {
        return daterule;
    }

    public void setDaterule(String daterule) {
        this.daterule = daterule;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getIssearcher() {
        return issearcher;
    }

    public void setIssearcher(int issearcher) {
        this.issearcher = issearcher;
    }

    public int getUrlwebtype() {
        return urlwebtype;
    }

    public void setUrlwebtype(int urlwebtype) {
        this.urlwebtype = urlwebtype;
    }

    public int getRuletype() {
        return ruletype;
    }

    public void setRuletype(int ruletype) {
        this.ruletype = ruletype;
    }

    public int getStartenum() {
        return startenum;
    }

    public void setStartenum(int startenum) {
        this.startenum = startenum;
    }

    public int getContentwebtype() {
        return contentwebtype;
    }

    public void setContentwebtype(int contentwebtype) {
        this.contentwebtype = contentwebtype;
    }

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public String getAllcontentrule() {
        return allcontentrule;
    }

    public void setAllcontentrule(String allcontentrule) {
        this.allcontentrule = allcontentrule;
    }

    public int getContenttype() {
        return contenttype;
    }

    public void setContenttype(int contenttype) {
        this.contenttype = contenttype;
    }

    public String getPagenextxpath() {
        return pagenextxpath;
    }

    public void setPagenextxpath(String pagenextxpath) {
        this.pagenextxpath = pagenextxpath;
    }

    public String getPagenextcss() {
        return pagenextcss;
    }

    public void setPagenextcss(String pagenextcss) {
        this.pagenextcss = pagenextcss;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

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
