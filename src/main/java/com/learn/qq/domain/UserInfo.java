package com.learn.qq.domain;

import com.learn.framework.core.UnionBean;

import java.io.Serializable;

/**
 * 用户信息
 */
public class UserInfo extends UnionBean implements Serializable {

    private String username;
    private String realname;
    private String introduce;
    private String avatar;
    private long birthday;
    private int gender; //0,未知,1.男,2.女

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (null != getId()) sb.append("id=").append(getId()).append(",");
        if (null != username) sb.append("username=").append(username).append(",");
        if (null != realname) sb.append("realname=").append(realname).append(",");
        if (null != avatar) sb.append("avatar=").append(avatar).append(",");
        if (birthday > 0) sb.append("birthday=").append(birthday).append(",");
        if (null != introduce) sb.append("introduce=").append(introduce).append(",");
        return sb.toString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
