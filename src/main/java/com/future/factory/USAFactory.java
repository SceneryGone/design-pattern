package com.future.factory;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 17:56
 */
public class USAFactory extends AbsractFactory {

    @Override
    Chair createChair() {
        return new UASChair();
    }

    @Override
    Sofa createSofa() {
        return new UASSofa();
    }

    @Override
    Table createTable() {
        return new UASTable();
    }
}
