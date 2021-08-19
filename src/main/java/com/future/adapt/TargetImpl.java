package com.future.adapt;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 11:36
 */
public class TargetImpl implements Target {
    @Override
    public String filter(String str) {
        return str.replaceAll("a", "A");
    }
}
