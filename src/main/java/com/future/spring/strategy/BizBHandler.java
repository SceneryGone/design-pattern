package com.future.spring.strategy;

import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 09:40
 */
@Service
public class BizBHandler implements BizHandler {

    @Override
    public BizEnum name() {
        return BizEnum.BIZ_B;
    }

    @Override
    public void handler() {
        System.out.println("biz B handler");
    }

}
