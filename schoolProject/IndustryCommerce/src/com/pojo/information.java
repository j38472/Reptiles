package com.pojo;

/**
 * 信息表的实体类
 */
public class information {
    private int Id = 0; //数量
    private String bidding_number = null;//招标编号
    private String The_tender_name = null;//招标名称
    private String tenderee = null;//招标人
    private String bidding_agency = null;//招标代理机构
    private String bidding_type = null;//招标方式
    private String tender_content = null;//招标内容
    private String capital_source = null;//资金来源
    private String budget = null;//预算金额
    private String To_the_place = null;//招标地点
    private String qua_req = null;//            投标资格要求
    private String acq_tender_doc = null;//    获取招标文件方式
    private String Validity_period = null;//招标截止日期
    private String bid_opentime = null;//开标时间
    private String Openplace = null;//开标地点
    private String linkman = null;//联系人
    private String Phone = null;//电话
    private String facsimile = null;//传真
    private String date = null;//日期
    private int wid = 0;//网址规则表Id
    private String allcontent = null;//全部内容
    private int contenttype = 0;//1.按规则采集2.采集全部内容（需清洗）

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBidding_number() {
        return bidding_number;
    }

    public void setBidding_number(String bidding_number) {
        this.bidding_number = bidding_number;
    }

    public String getThe_tender_name() {
        return The_tender_name;
    }

    public void setThe_tender_name(String the_tender_name) {
        The_tender_name = the_tender_name;
    }

    public String getTenderee() {
        return tenderee;
    }

    public void setTenderee(String tenderee) {
        this.tenderee = tenderee;
    }

    public String getBidding_agency() {
        return bidding_agency;
    }

    public void setBidding_agency(String bidding_agency) {
        this.bidding_agency = bidding_agency;
    }

    public String getBidding_type() {
        return bidding_type;
    }

    public void setBidding_type(String bidding_type) {
        this.bidding_type = bidding_type;
    }

    public String getTender_content() {
        return tender_content;
    }

    public void setTender_content(String tender_content) {
        this.tender_content = tender_content;
    }

    public String getCapital_source() {
        return capital_source;
    }

    public void setCapital_source(String capital_source) {
        this.capital_source = capital_source;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getTo_the_place() {
        return To_the_place;
    }

    public void setTo_the_place(String to_the_place) {
        To_the_place = to_the_place;
    }

    public String getQua_req() {
        return qua_req;
    }

    public void setQua_req(String qua_req) {
        this.qua_req = qua_req;
    }

    public String getAcq_tender_doc() {
        return acq_tender_doc;
    }

    public void setAcq_tender_doc(String acq_tender_doc) {
        this.acq_tender_doc = acq_tender_doc;
    }

    public String getValidity_period() {
        return Validity_period;
    }

    public void setValidity_period(String validity_period) {
        Validity_period = validity_period;
    }

    public String getBid_opentime() {
        return bid_opentime;
    }

    public void setBid_opentime(String bid_opentime) {
        this.bid_opentime = bid_opentime;
    }

    public String getOpenplace() {
        return Openplace;
    }

    public void setOpenplace(String openplace) {
        Openplace = openplace;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFacsimile() {
        return facsimile;
    }

    public void setFacsimile(String facsimile) {
        this.facsimile = facsimile;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getAllcontent() {
        return allcontent;
    }

    public void setAllcontent(String allcontent) {
        this.allcontent = allcontent;
    }


}
