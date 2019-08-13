package com.kzm.retrofit.remote.dto;

import java.io.Serializable;

public class Main implements Serializable {

    @SerializedName("temp")
    public float temp;
    @SerializedName("tempMax")
    public float tempMax;
    @SerializedName("tempMin")
    public float tempMin;
    public main(float temp,float tempMin,float tempMax){
        this.temp=temp;
        this.tempMax=tempMax;
        this.tempMin=tempMin;
    }
}
