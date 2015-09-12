package com.vstechlab.demo.data.repository.datasource;

import com.vstechlab.demo.data.entity.FollowersEntity;

import java.util.List;

import rx.Observable;

/**
 * Interface that represent Data Store from where data is retrieved.
 */
public interface UserDataStore {

    /**
     * Get an {@link rx.Observable} which will emit a list of {@link FollowersEntity}
     *
     * @param username username of user for which to fetch followers list
     */
    Observable<List<FollowersEntity>> getUserFollowersList(String username);
}
