package com.future.prototype.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-17 09:57
 */
public class PrototypeFactory {

    private static Map<String, IPrototype> prototypes = new HashMap<>();

    static {
        prototypes.put(ModelType.MOVIE.getName(), new Movie());
        prototypes.put(ModelType.EBOOK.getName(), new EBook());
    }

    /**
     * 获取对象时，是使用name来进行对象拷贝
     */
    public static IPrototype getInstance(final String s) throws CloneNotSupportedException {
        return prototypes.get(s).clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        final IPrototype instance = PrototypeFactory.getInstance(ModelType.MOVIE.getName());
        System.out.println(instance);
    }
}
