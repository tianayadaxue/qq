package com.learn.qq.service;

import com.learn.qq.domain.UserInfo;

public interface ICurrentUserInfoService {
    /**
     * 加载当前用户信息
     * @return 当前登录用户信息
     */
    public UserInfo loadCurrentUserInfo();

    /**
     * 获取默认的用户信息
     * @return
     */
    public UserInfo loadDefaultUserInfo();

    public boolean modifyUserInfo(UserInfo newUserInfo);
}
