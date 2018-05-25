package com.test;

/**
 *
 */
public class ProvinceWebUrl {
    int id = 0;
    String mainweb = null;
    String province = null;

    public ProvinceWebUrl() {//默认构造
    }

    public ProvinceWebUrl(int id, String mainweb, String province) {
        this.id = id;
        this.mainweb = mainweb;
        this.province = province;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainweb() {
        return mainweb;
    }

    public void setMainweb(String mainweb) {
        this.mainweb = mainweb;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


}
