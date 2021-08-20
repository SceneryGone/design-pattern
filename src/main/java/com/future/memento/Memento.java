package com.future.memento;

import lombok.Data;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 10:50
 */
@Data
public class Memento {

    private String state = "从备份对象恢复为原始对象";
    private String id;
    private String name;
    private String phone;

    public Memento(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

}
