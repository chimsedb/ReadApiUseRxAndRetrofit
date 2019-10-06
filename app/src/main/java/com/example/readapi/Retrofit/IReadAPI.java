package com.example.readapi.Retrofit;

import com.example.readapi.Model.Affenpinscher;
import com.example.readapi.Model.Message;
import com.example.readapi.Model.RootObject;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IReadAPI {
    @GET("breeds/list/all?fbclid=IwAR249CGbv6ng7iM7QhHZEIC1gASxdbb4Q6N5RPAVAIGKFCAvptYEYpQnE9Q")
    Observable<RootObject> getObject();

    @GET("breed/{name}/images?fbclid=IwAR2ajppwI7utH_tJ9lI2wG07CAybh298eCQxdlxL_VMBwZNsVh5SbbY9ORg")
    Observable<Affenpinscher> getAffenpinscher(@Path("name") String name);
}
