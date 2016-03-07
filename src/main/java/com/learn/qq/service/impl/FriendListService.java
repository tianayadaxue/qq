package com.learn.qq.service.impl;

import com.learn.qq.domain.FriendInfo;
import com.learn.qq.model.impl.FriendListModel;
import com.learn.qq.service.IFriendListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FriendListService implements IFriendListService {
    private Logger log = LoggerFactory.getLogger(FriendListModel.class);

    @Override
    public List<FriendInfo> loadFriendList() {
        log.debug("加载好友信息");
        return null;
    }
}
