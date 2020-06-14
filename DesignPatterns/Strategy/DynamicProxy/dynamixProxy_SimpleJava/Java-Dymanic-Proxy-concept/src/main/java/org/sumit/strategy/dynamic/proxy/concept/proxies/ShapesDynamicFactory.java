package org.sumit.strategy.dynamic.proxy.concept.proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ShapesDynamicFactory implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

    public static Object createObject(Class aClassz){
        return Proxy.newProxyInstance(aClassz.getClassLoader(),aClassz.getInterfaces(),new ShapesDynamicFactory());
    }
}
