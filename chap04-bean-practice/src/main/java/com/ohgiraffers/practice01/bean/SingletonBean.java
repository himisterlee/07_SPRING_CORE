package com.ohgiraffers.practice01.bean;

import org.springframework.context.annotation.Primary;

public class SingletonBean {

    private String message;

    public SingletonBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
