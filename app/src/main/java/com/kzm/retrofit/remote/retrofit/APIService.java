package com.kzm.retrofit.remote.retrofit;

import android.app.DownloadManager;

import androidx.core.provider.FontsContractCompat;

public interface APIService {
    @GET("/Weather")
    Call<ResponseWeather> getCurrentWeatherData(@Header("x-rapidapi-key")String apiKey,
                                                @Query("units") String units,
                                                @Query("mode") String mode,
                                                @Query("q") String q);
}
