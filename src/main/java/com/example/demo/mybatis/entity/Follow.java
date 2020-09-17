package com.example.demo.mybatis.entity;

public class Follow {
    int followlistId;

    public int getFollowlistId() {
        return followlistId;
    }

    public void setFollowlistId(int followId) {
        this.followlistId = followId;
    }

    public int getFollowingId() {
        return followingId;
    }

    public void setFollowingId(int followingId) {
        this.followingId = followingId;
    }

    public int getFollowerId() {
        return followerId;
    }

    public void setFollowerId(int followerId) {
        this.followerId = followerId;
    }

    int followingId;  //被关注者
    int followerId;   //关注者

}
