package com.future.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-18 11:52
 */
public class FlyweighFactory {

    public Map<String, Flyweight> pool = new HashMap<>();

    public FlyweighFactory() {
        pool.put("A", new ConcreteFlyweight("A"));
        pool.put("B", new ConcreteFlyweight("B"));
        pool.put("C", new ConcreteFlyweight("C"));
    }

    //根据内部状态来查找值
    public Flyweight getFlyweight(String key) {
        if (pool.containsKey(key)) {
            System.out.println("===享元池中有，直接复用，key："+key);
            return pool.get(key);
        } else {
            System.out.println("===享元池中没有，重新创建并复用，key："+key);
            Flyweight flyweightNew = new ConcreteFlyweight(key);
            pool.put(key,flyweightNew);
            return flyweightNew;
        }
    }

}
