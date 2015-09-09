package com.vstechlab.demo.data.repository;

import com.vstechlab.demo.domain.entity.Followers;
import com.vstechlab.demo.domain.repository.UserRepository;

import java.util.List;

import rx.Observable;

/**
 * {@link UserRepository} for retrieving user data
 */
public class UserDataRepository implements UserRepository{

    @Override
    public Observable<List<Followers>> getFollowers(String username) {
        return null;
    }
}
