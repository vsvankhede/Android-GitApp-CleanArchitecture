package com.vstechlab.demo.domain.repository;

import com.vstechlab.demo.domain.entity.Followers;

import java.util.List;

import rx.Observable;

/**
 * repository that represents a Repository for getting user related data
 */
public interface UserRepository {

    /**
     * Get an {@link rx.Observable} which will emit  a list of {@link Followers}
     *
     * @param username The username used to retrieve followers
     */
    Observable<List<Followers>> getFollowers(String username);
}
