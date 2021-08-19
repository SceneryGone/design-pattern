package com.future.spring.state;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 17:36
 */
public class PackageContext {

    private PackageState currentState;

    private String packageId;

    public PackageContext(PackageState currentState, String packageId) {
        this.currentState = currentState;
        this.packageId = packageId;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }

    public void update() {
        this.currentState.updateState(this);
    }

}

