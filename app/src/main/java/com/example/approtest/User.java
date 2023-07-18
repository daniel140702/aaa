package com.example.approtest;

import com.google.firebase.auth.FirebaseUser;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String fullName;
    private String id;
    private HashMap<String, Event> participated_events;



    public User(String fullName, String id, HashMap<String, Event> participated_events) {
        this.fullName = fullName;
        this.id = id;
        this.participated_events = new HashMap<String, Event>();
        for (Map.Entry<String, Event> entry : participated_events.entrySet()) {
            this.participated_events.put(entry.getKey(), entry.getValue());
        }
    }


    public User(User other){
        this(other.fullName, other.id, other.participated_events);
    }

    public User(){
        this.fullName = null;
        this.id = null;
        this.participated_events = new HashMap<String, Event>();
    }
}


