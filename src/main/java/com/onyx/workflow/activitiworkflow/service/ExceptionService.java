package com.onyx.workflow.activitiworkflow.service;

import org.springframework.stereotype.Component;

@Component
public class ExceptionService {

    public void storeResume() {
        throw new IllegalArgumentException("Exception should be thrown");
    }

}
