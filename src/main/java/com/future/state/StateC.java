package com.future.state;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:20
 */
public class StateC implements State {

    private static final StateC INSTANCE = new StateC();

    private StateC() {

    }

    public static StateC instance() {
        return INSTANCE;
    }

    @Override
    public void handle(Context context) {
        System.out.println("=== 进入状态C");
        context.setCurrentState(this);
    }

}
