package com.vstechlab.demo.data.entity.mapper;

import com.vstechlab.demo.data.entity.FollowersEntity;
import com.vstechlab.demo.domain.entity.Followers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Mapper class used to transform {@link FollowersEntity} to {@link Followers} in the
 * Damain layer
 */
@Singleton
public class UserEntityDataMapper {

    @Inject
    public UserEntityDataMapper() {
    }

    public Followers transform(FollowersEntity followersEntity) {
        Followers followers = null;
        if (followersEntity != null) {
            followers = new Followers();
            followers.setAvatarUrl(followersEntity.getAvatarUrl());
            followers.setEventsUrl(followersEntity.getEventsUrl());
            followers.setFollowersUrl(followersEntity.getFollowersUrl());
            followers.setFollowingUrl(followersEntity.getFollowingUrl());
            followers.setGistsUrl(followersEntity.getGistsUrl());
            followers.setGravatarId(followersEntity.getGravatarId());
            followers.setHtmlUrl(followersEntity.getHtmlUrl());
            followers.setId(followersEntity.getId());
            followers.setOrganizationsUrl(followersEntity.getOrganizationsUrl());
            followers.setLogin(followersEntity.getLogin());
            followers.setReceivedEventsUrl(followersEntity.getReceivedEventsUrl());
            followers.setSiteAdmin(followersEntity.getSiteAdmin());
            followers.setStarredUrl(followersEntity.getStarredUrl());
            followers.setId(followersEntity.getId());
            followers.setType(followersEntity.getType());
            followers.setSubscriptionsUrl(followersEntity.getSubscriptionsUrl());
        }
        return followers;
    }


    public List<Followers> transformFollower(Collection<FollowersEntity> followersEntitiesCollection){
        List<Followers> followersList  = new ArrayList<Followers>();
        Followers followers;
        for (FollowersEntity followersEntity : followersEntitiesCollection) {
            followers = transform(followersEntity);
            if (followers !=  null) {
                followersList.add(followers);
            }
        }
        return followersList;
    }
}
