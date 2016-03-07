package com.learn.qq.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;

public class QQMainFrame extends JFrame {
    private Logger log = LoggerFactory.getLogger(QQMainFrame.class);

    private CurrentUserInfoPanel currentUserInfoPanel;
    private FriendListPanel friendListPanel;
    private WorkToolPanel workToolPanel;

    private final int DEFAULT_FRAME_WIDTH = 300;
    private final int DEFAULT_FRAME_HEIGHT = 700;

    public QQMainFrame(CurrentUserInfoPanel currentUserInfoPanel, FriendListPanel friendListPanel, WorkToolPanel workToolPanel) {
        this.currentUserInfoPanel = currentUserInfoPanel;
        this.friendListPanel = friendListPanel;
        this.workToolPanel = workToolPanel;

        this.setName("main-frame");
        this.setTitle("funny QQ");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Image img = new ImageIcon("resource/images/icon.jpg").getImage();
        this.setIconImage(img.getScaledInstance(16, 16, Image.SCALE_DEFAULT));
        this.setPreferredSize(new Dimension(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT));
        this.setSize(new Dimension(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT));
        this.setMinimumSize(new Dimension(DEFAULT_FRAME_WIDTH, (int) (DEFAULT_FRAME_HEIGHT * 0.8)));
        this.setMaximumSize(new Dimension(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT * 2));
        this.setLocation(calculateLocationOfFrame(this));

        this.add(currentUserInfoPanel, BorderLayout.NORTH);
        this.add(friendListPanel, BorderLayout.CENTER);
        this.add(workToolPanel, BorderLayout.SOUTH);

        this.pack();
    }

    private Point calculateLocationOfFrame(QQMainFrame qqMainFrame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (screenSize.getWidth() - qqMainFrame.getWidth() - 20);
        int y = (int) (screenSize.getHeight() - qqMainFrame.getHeight()) / 2;
        return new Point(x, y);
    }

    public void showView() {
        this.currentUserInfoPanel.showView();
        this.friendListPanel.showView();
        this.workToolPanel.showView();
        this.setVisible(true);
    }
}
