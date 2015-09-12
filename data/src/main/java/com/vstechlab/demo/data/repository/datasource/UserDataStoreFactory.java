package com.vstechlab.demo.data.repository.datasource;

import com.vstechlab.demo.data.net.ApiManager;
import com.vstechlab.demo.data.net.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Factory that creates different implementation of {@link UserDataStore}.
 */
@Singleton
public class UserDataStoreFactory {

    // TODO: 9/12/2015 add retreived cloud data to cache
    @Inject
    public UserDataStoreFactory() {
    }

    // TODO: 9/12/2015 add condition for cache
    public UserDataStore create(){
        UserDataStore userDataStore;
        userDataStore = createCloudDataStore();
        return  userDataStore;
    }
    public UserDataStore createCloudDataStore() {
        ApiManager restApi = new UserService();
        return new CloudUserDataSource(restApi);
    }
}
