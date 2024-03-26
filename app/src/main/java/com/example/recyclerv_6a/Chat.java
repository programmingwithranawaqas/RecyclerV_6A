package com.example.recyclerv_6a;

public class Chat {
    private String name, msg, time;
    private int count;

    public Chat() {
    }

    public Chat(String name, String msg, String time, int count) {
        this.name = name;
        this.msg = msg;
        this.time = time;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
