package com.future.bridge.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 14:22
 */
public class FileUploaderImpl implements FileUploader {

    private FileUploadExecutor excutor = null;

    public FileUploaderImpl(FileUploadExecutor excutor) {
        this.excutor = excutor;
    }

    @Override
    public Object upload(String path) {
        return this.excutor.uploadFile(path);
    }

    @Override
    public boolean check(Object object) {
        return this.excutor.checkFile(object);
    }
}
