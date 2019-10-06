package com.example.readapi.Model;

import java.util.List;

public class Affenpinscher {
    private List<String> message ;
    private String status ;

    public Affenpinscher(List<String> message, String status) {
        this.message = message;
        this.status = status;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
