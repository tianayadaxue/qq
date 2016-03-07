package com.learn.qq.controller.impl;

import com.learn.qq.controller.IFriendListController;
import com.learn.qq.service.IFriendListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FriendListController implements IFriendListController {
    private Logger log = LoggerFactory.getLogger(FriendListController.class);

    private IFriendListService friendListService;

    public void setFriendListService(IFriendListService friendListService) {
        this.friendListService = friendListService;
    }
}
