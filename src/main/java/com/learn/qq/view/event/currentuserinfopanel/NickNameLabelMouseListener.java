package com.learn.qq.view.event.currentuserinfopanel;

import com.learn.qq.model.ICurrentUserInfoModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NickNameLabelMouseListener extends MouseAdapter {

    private ICurrentUserInfoModel currentUserInfoModel;

    public NickNameLabelMouseListener(ICurrentUserInfoModel model) {
        this.currentUserInfoModel = model;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
    }
}