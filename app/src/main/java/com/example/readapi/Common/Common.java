package com.example.readapi.Common;

import com.example.readapi.Retrofit.IReadAPI;
import com.example.readapi.Retrofit.RetrofitClient;

public class Common {
    public static IReadAPI getApi(){
        return RetrofitClient.getInstance().create(IReadAPI.class);
    }
}
