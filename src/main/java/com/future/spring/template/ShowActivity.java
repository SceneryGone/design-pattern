package com.future.spring.template;

import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 14:12
 */
@Service
public class ShowActivity extends AbstractHandler {

    @Override
    public void handler() {
        System.out.println("show activity");
    }

    @Override
    protected void validate() {
        System.out.println("Show validate");
    }
}
