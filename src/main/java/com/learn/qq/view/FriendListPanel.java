package com.learn.qq.view;

import com.learn.framework.core.BaseInfoPanel;
import com.learn.qq.controller.IFriendListController;
import com.learn.qq.domain.FriendInfo;
import com.learn.qq.model.IFriendListModel;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Observable;

public class FriendListPanel extends BaseInfoPanel {
    private Logger log = LoggerFactory.getLogger(FriendListPanel.class);

    private IFriendListController friendListController;

    public FriendListPanel(Observable model) {
        super(model);
        this.setName("friend-list-panel");
        log.debug("Init friend list panel.");

        assembleComponents();
        loadFriends();
        registerEvents();
    }

    private void loadFriends() {
        Assert.isInstanceOf(IFriendListModel.class, getModel());
        IFriendListModel friendListModel = (IFriendListModel)getModel();
        friendListModel.reloadFriendList();
    }

    @Override
    public void showView() {
        this.setVisible(true);
    }

    @Override
    public void assembleComponents() {
        this.add(new Label("Find your friends here."));
    }

    @Override
    public void registerEvents() {
        Assert.isInstanceOf(IFriendListModel.class, getModel());
        IFriendListModel friendListModel = (IFriendListModel)getModel();
    }

    public void setFriendListController(IFriendListController friendListController) {
        this.friendListController = friendListController;
    }

    @Override
    public void update(Observable model, Object data) {
        Assert.notNull(data);
        Assert.isInstanceOf(Collection.class, data);
        Collection friendObjects = (Collection) data;
        for (Object friendObj : friendObjects) {
            Assert.isInstanceOf(FriendInfo.class, friendObj);
            JPanel friendInfoPanel = prepareFriendInfoPanel((FriendInfo) friendObj);
            friendInfoPanel.setName(((FriendInfo) friendObj).getUserid());
            this.add(friendInfoPanel);
        }
    }

    private JPanel prepareFriendInfoPanel(FriendInfo friendInfo) {
        JPanel infoPanel = initFriendPanel();
        addAvatarLabel(friendInfo, infoPanel);
        addTextInfoPanel(friendInfo);
        return infoPanel;
    }

    private JPanel initFriendPanel() {
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.X_AXIS));
        int oneRowFriendInfoHeight = 30;
        infoPanel.setPreferredSize(new Dimension(this.getWidth(), oneRowFriendInfoHeight));

        return infoPanel;
    }

    private void addAvatarLabel(FriendInfo friendInfo, JPanel infoPanel) {
        JLabel avatarLabel = new JLabel(new ImageIcon(friendInfo.getAvatar()));
        avatarLabel.setToolTipText(friendInfo.getNickname());
        int avatarWidth = 30;
        int avatarHeight = infoPanel.getHeight();
        avatarLabel.setPreferredSize(new Dimension(avatarWidth, avatarHeight));
        avatarLabel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 0));

        infoPanel.add(avatarLabel);
    }

    private JPanel addTextInfoPanel(FriendInfo friendInfo) {
        log.trace("render user %s text info", friendInfo.getUserid());
        JPanel userInfoPanel = new JPanel();
        JPopupMenu menu = new JPopupMenu("删除好友");
        userInfoPanel.setComponentPopupMenu(menu);
        userInfoPanel.setLayout(new BoxLayout(userInfoPanel, BoxLayout.Y_AXIS));
        userInfoPanel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 0));

        String showName = StringUtils.isEmpty(friendInfo.getNickname()) ? friendInfo.getUsername() : friendInfo.getNickname();
        JLabel userNameLabel = new JLabel(showName);
        userNameLabel.setToolTipText(friendInfo.getNickname() + ":" + friendInfo.getUsername());
        userInfoPanel.add(userNameLabel);

        String introduce = StringUtils.trimToEmpty(friendInfo.getIntroduce());
        JLabel introduceLabel = new JLabel(introduce);
        introduceLabel.setToolTipText(introduce);
        userInfoPanel.add(introduceLabel);

        return userInfoPanel;
    }
}
