package com.learn.framework.connect;

import com.learn.framework.core.SystemProperty;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class HttpHelper {
    private Logger log = LoggerFactory.getLogger(HttpHelper.class);
    private Logger netLog = LoggerFactory.getLogger("NET_LOG");

    private static HttpHelper instance = new HttpHelper();

    private String service_location;
    private HttpClient httpClient = null;

    private HttpHelper() {
        log.debug("Inital http helper...");
        service_location = SystemProperty.getInstance().getString("service_location");
        httpClient = HttpClients.createDefault();
    }

    public static HttpHelper getInstance() {
        return instance;
    }

    public Map<String, String> post(String api, Map<String, String> requestParameter) {
        netLog.info("Send post request for [%s], with data [%s]", api, requestParameter);
        new HttpPost(service_location).re
        netLog.info("Finish post request, result [%s].", response);
        return null;
    }
}
