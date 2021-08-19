package com.future.composite.demo2;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 15:03
 */
public class Node extends AbstractNode {
    private final List<AbstractNode> myChildList;
    private int id;
    private int pid;

    public Node() {
        myChildList = Lists.newArrayList();
    }


    @Override
    public boolean isRoot() {
        return -1 == pid;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getParentId() {
        return pid;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setParentId(int parentId) {
        this.pid = parentId;
    }

    @Override
    public void add(AbstractNode abstractNode) {
        abstractNode.setParentId(this.pid + myChildList.size());
        abstractNode.setId(abstractNode.getParentId() + 1);
        myChildList.add(abstractNode);
    }

    @Override
    public void remove(AbstractNode g) {
        myChildList.remove(g);
    }

    @Override
    public AbstractNode getChild(int i) {
        return myChildList.get(i);
    }

}
