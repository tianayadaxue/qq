package com.learn.framework.core;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public abstract class BaseInfoPanel extends JPanel implements Observer
{

    private Observable model;

    /**
     * 构造一个新面板
     * @param model 面板对应模型
     */
    public BaseInfoPanel(Observable model)
    {
        this.model = model;
    }

    /**
     * <h5>显示面板</h5>
     * <p>由面板所属框架在显示是调用</p>
     */
    public void showView()
    {
        this.setVisible(true);
    }

    /**
     * <h5>隐藏面板</h5>
     * <p>由面板所属框架在隐藏时调用</p>
     */
    public void hiddenView(){
        this.setVisible(false);
    };

    /**
     * <h5>销毁面板</h5>
     * <p>由面板所在框架在销毁时调用</p>
     */
    public void dispose(){
        this.setVisible(false);
    }

    /**
     * <h5>组装面板相关组件</h5>
     */
    public abstract void assembleComponents();

    /**
     * 注册面板及组件相关事件
     */
    public abstract void registerEvents();

    @Override
    public void update(Observable model, Object data) {
        this.repaint();
    }

    public void setModel(Observable model) {
        this.model = model;
    }

    public Observable getModel() {
        return model;
    }
}
