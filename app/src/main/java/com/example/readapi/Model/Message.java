package com.example.readapi.Model;

import java.util.List;

public class Message {
    private List<Object> affenpinscher ;

    public Message(List<Object> affenpinscher) {
        this.affenpinscher = affenpinscher;
    }

    public List<Object> getAffenpinscher() {
        return affenpinscher;
    }

    public void setAffenpinscher(List<Object> affenpinscher) {
        this.affenpinscher = affenpinscher;
    }

    public String getName(){
        return "affenpinscher";
    }
}
