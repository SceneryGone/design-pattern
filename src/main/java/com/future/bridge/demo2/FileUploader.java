package com.future.bridge.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 14:22
 */
public interface FileUploader {

    Object upload(String path);

    boolean check(Object object);
}
