package com.reber.wondersoftheworld;

import java.io.Serializable;

public class Landmark implements Serializable{
    String name,country,history;
    int image;
    public Landmark(String name, String country,int image, String history){
        this.name = name;
        this.country = country;
        this.history = history;
        this.image = image;
    }


}
