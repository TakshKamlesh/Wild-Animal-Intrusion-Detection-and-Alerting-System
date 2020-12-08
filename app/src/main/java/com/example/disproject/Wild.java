package com.example.disproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Wild {

    public String currTime;

    Wild(){

    }

    void setTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        String currentDateandTime = sdf.format(new Date());
        this.currTime = currentDateandTime;

    }
}
