package com.learn.qq.controller.impl;

import com.learn.qq.controller.ICurrentUserInfoController;
import com.learn.qq.service.ICurrentUserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentUserInfoController implements ICurrentUserInfoController {
    private Logger log = LoggerFactory.getLogger(CurrentUserInfoController.class);

    private ICurrentUserInfoService currentUserInfoService;

    @Override
    public void loadCurrentUserInfo() {
        log.trace("Controller: load current user info");
        currentUserInfoService.loadCurrentUserInfo();
    }

    public void setCurrentUserInfoService(ICurrentUserInfoService currentUserInfoService) {
        this.currentUserInfoService = currentUserInfoService;
    }
}
