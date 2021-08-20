package com.future.memento;

import lombok.Data;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 10:48
 */
@Data
public class Originator {

    private String state = "原始对象";

    private String id;

    private String name;

    private String phone;

    public Memento create() {
        return new Memento(id, name, phone);
    }

    public void restore(Memento m) {
        this.state = m.getState();
        this.id = m.getId();
        this.name = m.getName();
        this.phone = m.getPhone();
    }
}
