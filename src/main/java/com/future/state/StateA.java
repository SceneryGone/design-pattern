package com.future.state;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:20
 */
public class StateA implements State {

    private static StateA INSTANCE = new StateA();

    private StateA() {

    }

    public static StateA instance() {
        return INSTANCE;
    }

    @Override
    public void handle(Context context) {
        System.out.println("=== 进入状态A");
        context.setCurrentState(StateB.instance());
    }
}
