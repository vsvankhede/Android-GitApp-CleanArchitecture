package com.vstechlab.demo.data.net;

import com.vstechlab.demo.data.entity.FollowersEntity;
import com.vstechlab.demo.data.net.api.UserApi;

import java.util.List;

import retrofit.RestAdapter;
import rx.Observable;

public class UserService extends ApiManager {
    UserApi mUserApi;

    public UserService() {
        RestAdapter adapter = getAdapter();
        mUserApi = adapter.create(UserApi.class);
    }

    @Override
    public Observable<List<FollowersEntity>> getFollowers(String username) {
        return mUserApi.getFollowers(username);
    }
}
