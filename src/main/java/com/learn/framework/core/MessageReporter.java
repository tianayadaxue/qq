package com.learn.framework.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.Collection;

public class MessageReporter implements IMessageReporter {
    private Logger log = LoggerFactory.getLogger(MessageReporter.class);

    private String DEFAULT_TITLE_OF_INFORMATION = "Information";

    @Override
    public void showOptionMessage(JComponent currentComponent, String message) {
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(currentComponent);
        JOptionPane.showMessageDialog(parent, message, DEFAULT_TITLE_OF_INFORMATION, JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void showOptionWithTextMessage(JComponent currentComponent, String filePath, Collection<String> message) {

    }

    @Override
    public boolean showConfirmMessage(JComponent currentComponent, String message) {
        return false;
    }
}
