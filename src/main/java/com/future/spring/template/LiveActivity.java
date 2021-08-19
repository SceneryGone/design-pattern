package com.future.spring.template;

import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 14:13
 */
@Service
public class LiveActivity extends AbstractHandler {

    @Override
    public void handler() {
        System.out.println("live activity");
    }

    @Override
    protected void validate() {
        System.out.println("Live validate");
    }

}
