package com.xt.model;

/**
 * sunshine on 2017/3/28 15:16
 */

public class MessageEvent {
    private String message;
    public MessageEvent(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
