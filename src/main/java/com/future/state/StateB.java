package com.future.state;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:20
 */
public class StateB implements State {

    private static final StateB INSTANCE = new StateB();

    private StateB() {

    }

    public static StateB instance() {
        return INSTANCE;
    }

    @Override
    public void handle(Context context) {
        System.out.println("=== 进入状态B");
        context.setCurrentState(StateC.instance());
    }

}
