package com.future.prototype.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 09:57
 */
public enum ModelType {

    MOVIE("movie"),

    EBOOK("eBook");

    private String name;

    ModelType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
