package com.learn.qq.model.impl;

import com.learn.qq.domain.FriendInfo;
import com.learn.qq.model.IFriendListModel;
import com.learn.qq.service.IFriendListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Observable;

public class FriendListModel extends Observable implements IFriendListModel {
    private Logger log = LoggerFactory.getLogger(FriendListModel.class);

    private IFriendListService friendListService;

    public void setFriendListService(IFriendListService friendListService) {
        this.friendListService = friendListService;
    }

    @Override
    public void reloadFriendList() {
        log.debug("重新加载当前用户的好友列表");
        List<FriendInfo> friendList = friendListService.loadFriendList();
        this.notifyObservers(friendList);
    }
}
