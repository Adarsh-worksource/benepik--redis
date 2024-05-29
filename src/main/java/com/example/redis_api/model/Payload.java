package com.example.redis_api.model;


public class Payload {
    private String data;

    public Payload() {
    }

    public Payload(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Payload{" +
                "data='" + data + '\'' +
                '}';
    }
}