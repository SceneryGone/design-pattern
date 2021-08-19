package com.future.spring.factory;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author future
 * @date 2021-08-17 09:41
 */
@Service
public class PayFactory {

    @Autowired
    private List<PayHandler> payHandlers;

    private final Map<PayEnum, PayHandler> payHandlerMap = Maps.newHashMap();

    @PostConstruct
    private void registerPayWay() {
        payHandlers.forEach(payHandler -> {
            System.out.println("register :" + payHandler);
            payHandlerMap.put(payHandler.name(), payHandler);
        });
    }

    public PayHandler getPayHandler(PayEnum payEnum) {
        return payHandlerMap.get(payEnum);
    }


    private PayFactory() {

    }

}
