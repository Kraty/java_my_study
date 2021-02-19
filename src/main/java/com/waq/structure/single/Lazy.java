package com.waq.structure.single;

/**
 * 懒汉式单例
 * 线程不安全
 */

@SuppressWarnings("all")
public class Lazy {

    private Lazy() {}
    private static Lazy instance;

    public static Lazy getInstance() {
        if (instance == null) {
            return instance = new Lazy();
        }
        return instance;
    }

}
