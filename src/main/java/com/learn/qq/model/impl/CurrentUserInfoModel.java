package com.learn.qq.model.impl;

import com.learn.qq.domain.UserInfo;
import com.learn.qq.model.ICurrentUserInfoModel;
import com.learn.qq.service.ICurrentUserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;

public class CurrentUserInfoModel extends Observable implements ICurrentUserInfoModel {
    private Logger log = LoggerFactory.getLogger(CurrentUserInfoModel.class);

    private ICurrentUserInfoService currentUserInfoService;

    //data
    private UserInfo userInfo = null;

    @Override
    public UserInfo getDefaultUserInfo() {
        return currentUserInfoService.loadDefaultUserInfo();
    }

    @Override
    public void loadCurrentUserInfo() {
        userInfo = currentUserInfoService.loadCurrentUserInfo();
        this.setChanged();
        this.notifyObservers();
    }

    public void setCurrentUserInfoService(ICurrentUserInfoService currentUserInfoService) {
        this.currentUserInfoService = currentUserInfoService;
    }
}
