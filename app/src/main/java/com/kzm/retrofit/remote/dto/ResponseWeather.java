package com.kzm.retrofit.remote.dto;

import java.io.Serializable;
import java.util.List;

public class ResponseWeather implements Serializable {
    @SerializedName("Weather")
    public List<Weather> weatherList;

    @SerializedName("main")
    public Main main;
}
