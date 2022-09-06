package com.bootcoding.oops;

import com.bootcoding.basic.IfElse;

public class Fan {
    String company;
    int speed;
    int MAX_LIMIT =5;
    int MIN_LIMIT =0;
    public Fan(){
    }
public int increasespeed (int newspeed){
speed = newspeed;
if(newspeed>MAX_LIMIT){
    speed = MAX_LIMIT;
}
else if (newspeed > MIN_LIMIT){
    speed = MIN_LIMIT;
}
return speed;
}

    }
