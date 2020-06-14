package org.sumit.strategy.dynamic.proxy.factory;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;

public enum DynamicProxyFactory {
    INSTANCE;
    @SneakyThrows
    public  <T> T createObjectByType(Class<T> aClass){
        // Read more about the constructor
        Constructor constructor = aClass.getConstructors()[0];
        return (T) DynamicProxy.newInstance(constructor.newInstance());
    }
}
