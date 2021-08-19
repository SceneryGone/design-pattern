package com.future.state;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:18
 */
public class Context {

    private State currentState;

    public Context(State currentState) {
        this.currentState = currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void request() {
        currentState.handle(this);
    }

}
