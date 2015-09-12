package com.vstechlab.demo.data.repository.datasource;

import com.vstechlab.demo.data.entity.FollowersEntity;
import com.vstechlab.demo.data.net.ApiManager;

import java.util.List;

import rx.Observable;

/**
 * {@link UserDataStore} implementation based on connection to the rest api.
 */
public class CloudUserDataSource implements UserDataStore {

    private final ApiManager restApi;

    public CloudUserDataSource(ApiManager restApi) {
        this.restApi = restApi;
    }

    @Override
    public Observable<List<FollowersEntity>> getUserFollowersList(String username) {
        return restApi.getFollowers(username);
    }
}
