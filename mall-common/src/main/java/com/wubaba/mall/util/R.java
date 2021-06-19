package com.wubaba.mall.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class R<T> implements Serializable {
    /**
     * 响应代码
     */
    private long code;
    /**
     * 响应数据
     */
    private T data;

    /**
     * 响应消息
     */
    private String msg;

    private R(long code , String msg , T data){
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    /**
     * 响应成功并携带消息
     * @param msg
     * @param data
     * @param <E>
     * @return
     */
    public static <E> R success(String msg, E data){
        return new R<>(200,msg,data);
    }

    /**
     * 响应成功不携带数据
     * @param msg
     * @param <E>
     * @return
     */
    public static <E> R success(String msg){
        return new R<>(200,msg,null);
    }

    /**
     * 失败携带数据
     * @param msg
     * @param data
     * @param <E>
     * @return
     */
    public static <E> R field(String msg, E data){
        return new R<>(200,msg,data);
    }

    /**
     * 失败不携带数据
     * @param msg
     * @param data
     * @param <E>
     * @return
     */
    public static <E> R field(String msg){
        return new R<>(200,msg,null);
    }
}
