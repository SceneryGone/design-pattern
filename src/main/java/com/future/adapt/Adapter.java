package com.future.adapt;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 11:36
 */
public class Adapter implements Target {

    private final OtherClass otherClass;

    public Adapter() {
        otherClass = new OtherClass();
    }

    @Override
    public String filter(String str) {
        otherClass.preCheck(str);
        return otherClass.replaceStr(str);
    }

}
