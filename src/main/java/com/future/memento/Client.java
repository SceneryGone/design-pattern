package com.future.memento;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 10:51
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setId("1");
        originator.setName("jack");
        originator.setPhone("1234567890");
        System.out.println(originator);

        Memento memento = originator.create();
        originator.setName("Tom");
        System.out.println(originator);
        originator.restore(memento);
        System.out.println(originator);
    }

}
