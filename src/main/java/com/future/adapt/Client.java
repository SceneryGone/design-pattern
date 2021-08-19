package com.future.adapt;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 11:39
 */
public class Client {

    public static void main(String[] args) {
        final Target adapter = new Adapter();
        System.out.println(adapter.filter("<123"));
    }

}
