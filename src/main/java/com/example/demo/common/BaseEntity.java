package com.example.demo.common;


import lombok.Data;

@Data
public class BaseEntity<T> {

    /**
     * 用户令牌
     */
    String token;


    /**
     * 响应吗
     */
    String code;

    /**
     * 消息
     */
    String message;

    /**
     * 数据
     */
    T data;

    public BaseEntity() {
    }

    public BaseEntity(String token, String code) {
        this.token = token;
        this.code = code;
    }

    public BaseEntity(String token, String code, String message) {
        this.token = token;
        this.code = code;
        this.message = message;
    }

    public BaseEntity(String token, String code, String message, T data) {
        this.token = token;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 构建数据格式
     */
    public static BaseEntity success(){
        return new BaseEntity();
    }

}
