package com.learn.framework.core;

import javax.swing.*;
import java.util.Collection;

public interface IMessageReporter {
    public void showOptionMessage(JComponent currentComponent, String message);

    public void showOptionWithTextMessage(JComponent currentComponent, String filePath, Collection<String> message);

    public boolean showConfirmMessage(JComponent currentComponent, String message);
}
