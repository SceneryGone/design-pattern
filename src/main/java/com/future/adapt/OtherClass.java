package com.future.adapt;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 11:37
 */
public class OtherClass {

    public String replaceStr(String str) {
        return str.replace("<", "[");
    }

    public void preCheck(String str) {
        System.out.println("pre check " + str);
    }

}
