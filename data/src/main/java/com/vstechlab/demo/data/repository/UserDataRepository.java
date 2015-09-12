package com.vstechlab.demo.data.repository;

import com.vstechlab.demo.data.entity.mapper.UserEntityDataMapper;
import com.vstechlab.demo.data.repository.datasource.UserDataStore;
import com.vstechlab.demo.data.repository.datasource.UserDataStoreFactory;
import com.vstechlab.demo.domain.entity.Followers;
import com.vstechlab.demo.domain.repository.UserRepository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

/**
 * {@link UserRepository} for retrieving user data
 */
@Singleton
public class UserDataRepository implements UserRepository{
    private final UserDataStoreFactory userDataStoreFactory;
    private final UserEntityDataMapper userEntityDataMapper;

    @Inject
    public UserDataRepository(UserDataStoreFactory userDataStoreFactory,
                              UserEntityDataMapper userEntityDataMapper) {
        this.userDataStoreFactory = userDataStoreFactory;
        this.userEntityDataMapper = userEntityDataMapper;
    }

    @Override
    public Observable<List<Followers>> getUserFollowers(String username) {
        final UserDataStore userDataStore =  this.userDataStoreFactory.create();
        return userDataStore.getUserFollowersList(username)
                .map(this.userEntityDataMapper::transformFollower);
    }
}
