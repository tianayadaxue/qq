package com.learn.qq.view;

import com.learn.framework.core.BaseInfoPanel;
import com.learn.qq.controller.ICurrentUserInfoController;
import com.learn.qq.domain.UserInfo;
import com.learn.qq.model.ICurrentUserInfoModel;
import com.learn.qq.view.event.currentuserinfopanel.AvatarLabelMouseListener;
import com.learn.qq.view.event.currentuserinfopanel.IntroduceTextAreaMouseListener;
import com.learn.qq.view.event.currentuserinfopanel.NickNameLabelMouseListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;

public class CurrentUserInfoPanel extends BaseInfoPanel {
    private static final Logger log = LoggerFactory.getLogger(CurrentUserInfoPanel.class);

    private ICurrentUserInfoController currentUserInfoController;

    private JLabel avaterLabel;
    private JLabel nickNameLabel;
    private JTextArea introduceTextArea;

    public CurrentUserInfoPanel(Observable model) {
        super(model);
        this.setPreferredSize(new Dimension(this.getWidth(), 80));
        this.setName("current-user-info-panel");

        assembleComponents();
        registerEvents();
    }

    @Override
    public void showView()
    {
        super.showView();
        currentUserInfoController.loadCurrentUserInfo();
    }

    @Override
    public void assembleComponents() {
//        SpringLayout layout = new SpringLayout();
//        this.setLayout(layout);
        this.avaterLabel = new JLabel("Icon");
        avaterLabel.setToolTipText("头像");
        this.add(avaterLabel);

        this.nickNameLabel = new JLabel("Unknow Name");
        nickNameLabel.setToolTipText("昵称");
        this.add(nickNameLabel);

        this.introduceTextArea = new JTextArea(2, 30);
        introduceTextArea.setToolTipText("个人介绍");
        this.add(introduceTextArea);
    }

    @Override
    public void registerEvents() {
        log.trace("Register current user info panel component listener.");
        this.avaterLabel.addMouseListener(new AvatarLabelMouseListener((ICurrentUserInfoModel) getModel()));
        this.nickNameLabel.addMouseListener(new NickNameLabelMouseListener((ICurrentUserInfoModel) getModel()));
        this.introduceTextArea.addMouseListener(new IntroduceTextAreaMouseListener((ICurrentUserInfoModel) getModel()));
    }

    @Override
    public void update(Observable model, Object data) {
        Assert.isInstanceOf(UserInfo.class, data);
        UserInfo userInfo = (UserInfo)data;

        //update userInfo into panel.
    }

    public void setCurrentUserInfoController(ICurrentUserInfoController currentUserInfoController) {
        this.currentUserInfoController = currentUserInfoController;
    }
}
