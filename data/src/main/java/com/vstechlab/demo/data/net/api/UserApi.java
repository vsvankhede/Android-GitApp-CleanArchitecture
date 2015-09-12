package com.vstechlab.demo.data.net.api;

import com.vstechlab.demo.data.entity.FollowersEntity;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public interface UserApi {
    /**
     * Get list of user followers
     *
     * @return Observable for followers
     */
    @GET("/user/{username}/followers")
    Observable<List<FollowersEntity>> getFollowers(@Path("username") String username);
}
