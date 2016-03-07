package com.learn.framework.starter.impl;

import com.learn.framework.starter.Initialize;
import com.learn.qq.view.QQMainFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InitializeQQ implements Initialize {
    private static final Logger log = LoggerFactory.getLogger(InitializeQQ.class);

    private QQMainFrame qqMainFrame;

    public void initialize() {
        this.qqMainFrame.showView();
    }

    public void setQqMainFrame(QQMainFrame qqMainFrame) {
        this.qqMainFrame = qqMainFrame;
    }
}
