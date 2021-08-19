package com.future.spring.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:53
 */
@Service
public class WaitForPickUp implements PackageState {

    @Autowired
    private Received received;

    @Override
    public PackageEnum getPackageEnum() {
        return PackageEnum.WaitForPickUp;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("业务操作-->等待取件!");
        ctx.setCurrentState(received);
    }
}
