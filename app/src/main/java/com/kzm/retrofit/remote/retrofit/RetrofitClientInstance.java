package com.kzm.retrofit.remote.retrofit;

public class RetrofitClientInstance {


        private static Retrofit retrofit;
        private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

        public static Retrofit getRetrofitInstance() {
            if (retrofit == null) {
                retrofit = new retrofit2.Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }

