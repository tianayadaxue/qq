package com.learn.framework.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    private static Logger log = LoggerFactory.getLogger(Starter.class);

    public static void main(String[] args) {
        log.info("Try to start QQ.");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/**/*.xml");
        Initialize starter = (Initialize)applicationContext.getBean("initialQQ");
        starter.initialize();
        log.info("Finish to load QQ.");
    }
}
