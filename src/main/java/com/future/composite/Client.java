package com.future.composite;

import java.util.Arrays;
import java.util.List;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 15:10
 */
public class Client {

    public static void main(String[] args) {
        final Leaf leaf = new Leaf();
        final Leaf leaf1 = new Leaf();

        List<Component> componentList = Arrays.asList(leaf, leaf1);
        final Node node = new Node(componentList);
        node.operation();
    }

}
