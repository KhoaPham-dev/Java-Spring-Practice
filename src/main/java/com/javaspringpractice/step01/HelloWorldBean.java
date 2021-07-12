package com.javaspringpractice.step01;

public class HelloWorldBean {
    private String string;
    public HelloWorldBean(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "string='" + string + '\'' +
                '}';
    }

    public void setString(String string) {
        this.string = string;
    }
}
