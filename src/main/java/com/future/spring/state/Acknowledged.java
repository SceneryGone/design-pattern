package com.future.spring.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述: 已下单
 *
 * @author future
 * @date 2021-08-19 17:37
 */
@Service
public class Acknowledged implements PackageState {

    @Autowired
    private WarehouseProcessing warehouseProcessing;

    @Override
    public PackageEnum getPackageEnum() {
        return PackageEnum.Acknowledged;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("业务操作-->已下单操作");
        ctx.setCurrentState(warehouseProcessing);
    }

}
