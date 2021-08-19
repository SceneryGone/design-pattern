package com.future.spring.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:52
 */
@Service
public class Delivering implements PackageState {

    @Autowired
    private WaitForPickUp waitForPickUp;

    @Override
    public PackageEnum getPackageEnum() {
        return PackageEnum.Delivering;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("派送中");
        ctx.setCurrentState(waitForPickUp);
    }
}
