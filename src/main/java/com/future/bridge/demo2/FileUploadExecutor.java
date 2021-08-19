package com.future.bridge.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 14:23
 */
public interface FileUploadExecutor {

    Object uploadFile(String path);

    boolean checkFile(Object object);

}
