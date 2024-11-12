package com.xushu.springboot_xushu.pojo;

import org.springframework.http.HttpStatus;

public class ResponseMessage<T>{

    private Integer code; // 200 500 404
    private String message;  //请求成功
    private T data;

    public static <T> ResponseMessage<T> success(T data){
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(HttpStatus.OK.value());
        responseMessage.setMessage("success");
        responseMessage.setData(data);
        return responseMessage;
    }

    public static <T> ResponseMessage<T> success(){
        return new ResponseMessage<>(HttpStatus.OK.value(),"success",null);
    }

    public ResponseMessage() {
        super();
    }

    public ResponseMessage(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
