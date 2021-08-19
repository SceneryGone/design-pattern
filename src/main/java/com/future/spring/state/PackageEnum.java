package com.future.spring.state;

import java.util.Optional;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:57
 */
public enum PackageEnum {
    /**
     * 1 - 已下单
     * 2 - 仓库处理中
     * 3 - 运输中
     * 4 - 派送中
     * 5 - 待取件
     * 6 - 已签收
     */
    Acknowledged((byte) 1, "已下单"),
    WarehouseProcessing((byte) 2, "仓库处理中"),
    InTransition((byte) 3, "运输中"),
    Delivering((byte) 4, "派送中"),
    WaitForPickUp((byte) 5, "待取件"),
    Received((byte) 6, "已签收");

    private Byte code;

    private String desc;


    PackageEnum(Byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Optional<PackageEnum> of(Byte code) {
        for (PackageEnum value : values()) {
            if (value.code.equals(code)) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }
}
