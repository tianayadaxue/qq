package com.learn.qq.service;

import com.learn.qq.domain.FriendInfo;

import java.util.List;

public interface IFriendListService {

    /**
     * 从服务器获取当前用户的好友列表
     * @return 当前用户的好友列表信息
     */
    public List<FriendInfo> loadFriendList();
}
