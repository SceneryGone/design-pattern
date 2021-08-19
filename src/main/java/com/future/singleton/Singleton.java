package com.future.singleton;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-16 15:24
 */
public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSingleton());
    }

}
