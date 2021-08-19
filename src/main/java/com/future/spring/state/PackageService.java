package com.future.spring.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:56
 */
@Service
public class PackageService {

    @Autowired
    private Acknowledged acknowledged;

    public void deliverInfo(Byte packageStatus) {
        final PackageContext context = new PackageContext(acknowledged, "1001");
        for (int i = 0; i < PackageEnum.values().length; i++) {
            context.update();
        }
    }

}
