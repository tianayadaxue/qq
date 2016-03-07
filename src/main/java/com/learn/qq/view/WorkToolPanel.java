package com.learn.qq.view;

import com.learn.framework.core.BaseInfoPanel;
import com.learn.qq.controller.IWorkToolController;
import com.learn.qq.model.IWorkToolModel;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Observable;

public class WorkToolPanel extends BaseInfoPanel {

    private IWorkToolController workToolController;

    private static final int HEIGHT_OF_WORK_TOOL_PANEL = 30;

    public WorkToolPanel(Observable model) {
        super(model);
        this.setName("work-tool-panel");
        this.setPreferredSize(new Dimension(this.getWidth(), HEIGHT_OF_WORK_TOOL_PANEL));
        assembleComponents();
        registerEvents();
    }

    @Override
    public void assembleComponents() {
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.LINE_AXIS);
        this.setLayout(boxLayout);

        JLabel menu = new JLabel("Menu");
        menu.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5));
        menu.setBackground(Color.LIGHT_GRAY);
        menu.setToolTipText("Click me to show the world.");
        int menuWidth = HEIGHT_OF_WORK_TOOL_PANEL;
        int menuHeight = this.getHeight();
        menu.setPreferredSize(new Dimension(menuWidth, menuHeight));
        this.add(menu);

        int canvasWidth = 25;
        int canvasHeight = 30;
        Image img = new ImageIcon("resource/images/tools/canvas.jpg").getImage().getScaledInstance(canvasWidth, canvasHeight, Image.SCALE_SMOOTH);
        JLabel canvasLabel = new JLabel(new ImageIcon(img));
        this.add(canvasLabel);


//        toolMenu = new JPopupMenu("Menu");
//        toolMenu.setVisible(true);
//        JMenuItem importDataMenu = new JMenuItem("Import");
//        JMenuItem importDataByXmlMenu = new JMenuItem("By XML");
//        JMenuItem importDataByExcelMenu = new JMenuItem("By Excel");
//        importDataMenu.add(importDataByXmlMenu);
//        importDataMenu.add(importDataByExcelMenu);
//        toolMenu.add(importDataMenu);
//        this.add(toolMenu, BorderLayout.WEST);
    }

    @Override
    public void registerEvents() {
//        final IWorkToolModel workToolModel = (IWorkToolModel)getModel();
//        workToolModel.clickLoadFriendByExcel();
//        workToolModel.clickLoadFriendByXml();
//        workToolModel.clickShowCanvas();
//        workToolModel.clickLogout();
    }

    public void setWorkToolController(IWorkToolController workToolController) {
        this.workToolController = workToolController;
    }
}
