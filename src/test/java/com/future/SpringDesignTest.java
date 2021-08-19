package com.future;

import com.future.spring.factory.PayEnum;
import com.future.spring.factory.PayFactory;
import com.future.spring.factory.PayHandler;
import com.future.spring.strategy.BizEnum;
import com.future.spring.strategy.BizService;
import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 14:21
 */
class SpringDesignTest extends DesignPatternApplicationTests {

    @Autowired
    private BizService bizService;

    @Autowired
    private PayFactory payFactory;

    @Test
    void testPay() {
        final PayHandler payHandler = payFactory.getPayHandler(PayEnum.ALIPAY);
        Assert.checkNonNull(payHandler);
    }

    @Test
    void testBiz() {
        bizService.handler(BizEnum.BIZ_A);
    }

}
