package com.future.spring.state;

import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:54
 */
@Service
public class Received implements PackageState {

    @Override
    public PackageEnum getPackageEnum() {
        return PackageEnum.Received;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("已签收 流程结束! 单号: " + ctx.getPackageId());
    }
}
