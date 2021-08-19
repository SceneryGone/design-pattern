package com.future.spring.factory;

import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 09:40
 */
@Service
public class WxPayHandler implements PayHandler {

    @Override
    public PayEnum name() {
        return PayEnum.WX;
    }

    @Override
    public void handler() {
        System.out.println("wx handler");
    }
}
