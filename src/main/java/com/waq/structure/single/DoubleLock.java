package com.waq.structure.single;

/**
 * 双重检查锁单例模式
 * 线程安全
 */

@SuppressWarnings("all")
public class DoubleLock {

    private DoubleLock() {}
    private volatile static DoubleLock instance;

    public static DoubleLock getInstance() {

        if (instance == null) {

            synchronized (DoubleLock.class) {

                if (instance == null) {
                    instance = new DoubleLock();
                }

            }

        }

        return instance;

    }

}
