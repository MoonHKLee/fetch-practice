package com.example.demo5.dto;

public class ResponseEnvelop {
    String message;
    Object body;

    public ResponseEnvelop() {
    }

    public ResponseEnvelop(String message, Object body) {
        this.message = message;
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
