package com.example.readapi.Model;

public class RootObject {
    private Message message ;
    private String status ;

    public RootObject(Message message, String status) {
        this.message = message;
        this.status = status;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
