package com.future.spring.factory;

import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 09:40
 */
@Service
public class AliPayHandler implements PayHandler {

    @Override
    public PayEnum name() {
        return PayEnum.ALIPAY;
    }

    @Override
    public void handler() {
        System.out.println("alipay handler");
    }

}
