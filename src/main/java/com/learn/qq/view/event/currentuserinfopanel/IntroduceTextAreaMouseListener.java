package com.learn.qq.view.event.currentuserinfopanel;

import com.learn.qq.model.ICurrentUserInfoModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IntroduceTextAreaMouseListener extends MouseAdapter {

    private ICurrentUserInfoModel currentUserInfoModel;

    public IntroduceTextAreaMouseListener(ICurrentUserInfoModel model) {
        this.currentUserInfoModel = model;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
    }

}
