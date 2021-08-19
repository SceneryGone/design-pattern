package com.future.spring.strategy;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * @author future
 * @date 2021-08-17 09:41
 */
@Service
public class BizService {

    @Autowired
    private List<BizHandler> bizHandlers;

    private final Map<BizEnum, BizHandler> bizHandlerMap = Maps.newHashMap();

    @PostConstruct
    private void registerPayWay() {
        bizHandlers.forEach(bizHandler -> {
            System.out.println("register :" + bizHandler);
            bizHandlerMap.put(bizHandler.name(), bizHandler);
        });
    }

    public void handler(BizEnum bizEnum) {
        final BizHandler bizHandler = bizHandlerMap.get(bizEnum);
        bizHandler.handler();
    }

    private BizService() {

    }

}
