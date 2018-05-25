package com.pojo;

/**
 * 关键字表实体类
 */
public class KeyWords {
    int id = 0;
    String keyWord = null;

    public KeyWords() {//无参构造
    }

    public KeyWords(int id, String keyWord) {//有参构造
        this.id=id;
        this.keyWord=keyWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
