package com.vstechlab.demo.data.cache;

import com.vstechlab.demo.data.entity.FollowersEntity;

import rx.Observable;

/**
 * A interface representing a user cache.
 */
public interface UserCache {
    /**
     * Gets an {@link rx.Observable} which will emit a {@link FollowersEntity}
     *
     * @param username The username to retrieve follower.
     */
    Observable<FollowersEntity> get(final String username);

    /**
     * Puts an element into the cache.
     *
     * @param followersEntity Element to insert in the cache.
     */
    void put(FollowersEntity followersEntity);

    /**
     * Checks if element exist in the cache.
     *
     * @param username The username used to look for inside the cache.
     * @return True if the element exist into the cache.
     */
    boolean isCached(final String username);

    /**
     * Checks if the cache is expired.
     *
     * @return true, the cache is expired, otherwise false.
     */
    boolean isExpired();

    /**
     * Evict all element of cache.
     */
    void evictAll();
}
