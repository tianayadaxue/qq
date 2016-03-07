package com.learn.qq.model;

import com.learn.qq.domain.UserInfo;

public interface ICurrentUserInfoModel {

    public UserInfo getDefaultUserInfo();

    /**
     * 从服务器加载当前用户信息
     */
    public void loadCurrentUserInfo();
}
