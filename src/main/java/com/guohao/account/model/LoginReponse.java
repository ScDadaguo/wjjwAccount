package com.guohao.account.model;

public class LoginReponse {
    Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LoginReponse{" +
                "data=" + data +
                '}';
    }

}
