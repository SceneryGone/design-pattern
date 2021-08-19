package com.future.decorators;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 17:38
 */
public class BaseComponent implements Component {

    @Override
    public void execute() {
        System.out.println("base component");
    }

}
