package com.learn.qq.service.impl;

import com.learn.framework.core.BaseService;
import com.learn.qq.domain.UserInfo;
import com.learn.qq.service.ICurrentUserInfoService;
import com.learn.qq.view.CurrentUserInfoPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentUserInfoServiceImpl extends BaseService implements ICurrentUserInfoService {
    private static final Logger log = LoggerFactory.getLogger(CurrentUserInfoPanel.class);

    @Override
    public UserInfo loadCurrentUserInfo() {
        log.debug("load current user info");
        //todo
        return null;
    }

    @Override
    public UserInfo loadDefaultUserInfo() {
        return null;
    }

    @Override
    public boolean modifyUserInfo(UserInfo newUserInfo) {
        log.debug("modify user info, userInfo=%s", newUserInfo);

        //TODO
        return false;
    }
}
