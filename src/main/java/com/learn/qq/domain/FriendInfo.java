package com.learn.qq.domain;

import org.apache.commons.lang.StringUtils;

import java.util.Date;

public class FriendInfo {
    private String userid;
    private String username; //用户名
    private String nickname; //昵称,用户自定义
    private String introduce; //介绍
    private String avatar; //头像
    private long birthday; //生日
    private int gender; //0,未知,1.男,2.女

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (null != userid) sb.append("userid=").append(userid);
        if (null != username) sb.append("username=").append(username);
        if (null != nickname) sb.append("nickname=").append(nickname);
        if (null != avatar) sb.append("avatar=").append(StringUtils.substringAfterLast(avatar, "/"));
        if (birthday > 0) sb.append("birthday=").append(new Date(birthday));
        if (gender >= 0) sb.append("gender=").append(gender).append(genderString());
        if (null != username) sb.append("username=").append(username);
        return sb.toString();
    }

    private String genderString() {
        switch (gender) {
            case 0:
                return "未知";
            case 1:
                return "男";
            case 2:
                return "女";
            default:
                return "未知";
        }
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
