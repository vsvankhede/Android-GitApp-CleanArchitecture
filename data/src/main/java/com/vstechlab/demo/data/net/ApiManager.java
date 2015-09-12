package com.vstechlab.demo.data.net;

import com.vstechlab.demo.data.entity.FollowersEntity;

import java.util.List;

import retrofit.RestAdapter;
import rx.Observable;

public abstract class ApiManager {
    private static final String BASE_URL = "https://api.github.com";
    private static RestAdapter mRestAdapter;

    public static RestAdapter getAdapter(){
        if (null == mRestAdapter) {
            createRestAdapter();
        }
        return mRestAdapter;
    }

    private static void createRestAdapter(){
        mRestAdapter = new RestAdapter.Builder()
                .setEndpoint(BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
    }

    public abstract Observable<List<FollowersEntity>> getFollowers(String username);

}
