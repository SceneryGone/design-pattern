package com.future.bridge.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 14:24
 */
public class Client {

    public static void main(String[] args) {
        final WindowFileUploadExecutor windowFileUploadExcutor = new WindowFileUploadExecutor();
        final FileUploaderImpl fileUploader = new FileUploaderImpl(windowFileUploadExcutor);
        fileUploader.upload("");
    }

}
