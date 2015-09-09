package com.vstechlab.demo.data.net;

import com.vstechlab.demo.data.entity.Followers;
import com.vstechlab.demo.data.net.api.UserApi;

import java.util.List;

import retrofit.RestAdapter;
import rx.Observable;

public class UserService extends ApiManager {
    UserApi mUserApi;

    private UserService() {
        RestAdapter adapter = getAdapter();
        mUserApi = adapter.create(UserApi.class);
    }

    public Observable<List<Followers>> getFollowers(String username) {
        return mUserApi.getFollowers(username);
    }

}
