package com.waq.structure.single;

/**
 * 饿汉式单例
 * 线程安全
 */

@SuppressWarnings("all")
public class Hunger {

    private Hunger() {}
    private static Hunger instance = new Hunger();

    public static Hunger getInstance() {
        return instance;
    }

}
