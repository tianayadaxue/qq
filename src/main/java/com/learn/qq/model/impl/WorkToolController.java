package com.learn.qq.model.impl;

import com.learn.qq.controller.IWorkToolController;
import com.learn.qq.service.IWorkToolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;

public class WorkToolController extends Observable implements IWorkToolController {
    private Logger log = LoggerFactory.getLogger(WorkToolController.class);

    private IWorkToolService workToolService;

    public void setWorkToolService(IWorkToolService workToolService) {
        this.workToolService = workToolService;
    }
}
