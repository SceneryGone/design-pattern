package com.future.spring.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:47
 */
@Service
public class InTransition implements PackageState {

    @Autowired
    private Delivering delivering;

    @Override
    public PackageEnum getPackageEnum() {
        return PackageEnum.InTransition;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("运输中!");
        ctx.setCurrentState(delivering);
    }

}
