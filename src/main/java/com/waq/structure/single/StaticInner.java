package com.waq.structure.single;

/**
 * 静态内部类单例模式
 * 线程安全
 */

@SuppressWarnings("all")
public class StaticInner {

    private StaticInner() {}

    public static StaticInner getInstance() {
        return Inner.instance;
    }

    private static class Inner {
        private static final StaticInner instance = new StaticInner();
    }

}
