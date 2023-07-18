package com.example.approtest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


public class Event {
    private ArrayList<User> participants;
    private Date date;
    private HashMap<User, Message> chat;
    private Place place;

    public Event (Date date, Place place){
        this.date = new Date(date.getTime());
        this.place = new Place(place);
        this.participants = new ArrayList<User>();
        this.chat = new HashMap<User, Message>();
    }




}
