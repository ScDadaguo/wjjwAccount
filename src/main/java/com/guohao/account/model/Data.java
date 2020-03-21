package com.guohao.account.model;

public class Data {
    String openid;
    String session_key;

    public String getOpenId() {
        return openid;
    }

    public void setOpenId(String openId) {
        this.openid = openId;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    @Override
    public String toString() {
        return "Data{" +
                "openId='" + openid + '\'' +
                ", session_key='" + session_key + '\'' +
                '}';
    }
}
