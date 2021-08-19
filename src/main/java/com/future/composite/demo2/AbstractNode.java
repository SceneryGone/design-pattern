package com.future.composite.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 15:01
 */
public abstract class AbstractNode {
    public abstract boolean isRoot();
    public abstract int getId();
    public abstract int getParentId();
    public abstract void setId(int id);
    public abstract void setParentId(int parentId);
    public abstract void add(AbstractNode abstractNode);
    public abstract void remove(AbstractNode g);
    public abstract AbstractNode getChild(int i);
}
