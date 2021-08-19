package com.future.composite;

import java.util.List;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 14:47
 */
public class Node extends Component {

    private final List<Component> myChildren;

    public Node(List<Component> myChildren) {
        this.myChildren = myChildren;
    }

    @Override
    public void operation() {
        // 这里的 for 循环想要表达的意思是：遍历组合节点下的所有子节点时才需要用到循环，而不是这里只能用循环。
        for (Component myChild : myChildren) {
            myChild.operation();
        }
    }

}
