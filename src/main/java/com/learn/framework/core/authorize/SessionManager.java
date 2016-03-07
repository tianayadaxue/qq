package com.learn.framework.core.authorize;

import com.learn.framework.connect.HttpHelper;
import com.learn.qq.domain.UserInfo;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SessionManager {
    private static Logger log = LoggerFactory.getLogger(SessionManager.class);

    private UserInfo currentUser = null;

    private static SessionManager instance = new SessionManager();

    private SessionManager() {/*单例*/}

    private static Lock lock = new ReentrantLock();

    public static SessionManager getInstance() {
        return instance;
    }

    public boolean login(String username, String password)
    {
        Map<String, String> data = new HashMap<String, String>();
        data.put("username", username);
        data.put("password", password);
        Map<String, String> result = HttpHelper.getInstance().post("", data);
    }
}
