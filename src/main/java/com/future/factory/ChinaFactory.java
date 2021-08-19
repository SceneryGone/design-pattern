package com.future.factory;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 17:53
 */
public class ChinaFactory extends AbsractFactory {

    @Override
    Chair createChair() {
        return new ChinaChair();
    }

    @Override
    Sofa createSofa() {
        return new ChinaSofa();
    }

    @Override
    Table createTable() {
        return new ChinaTable();
    }
}
