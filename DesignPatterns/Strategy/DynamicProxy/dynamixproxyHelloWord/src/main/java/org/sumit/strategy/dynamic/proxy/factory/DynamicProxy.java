package org.sumit.strategy.dynamic.proxy.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
  // invoke methods works like arounf advise :: Read More
  private Object proxyObject;

  private DynamicProxy(Object object) {
    this.proxyObject = object;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("The Arguments for Method in invoke  " + args[0]);
    System.out.println("Method that is called is " + method.getName());
    return method.invoke(proxy, args);
  }

  public static Object newInstance(Object object) {
    return Proxy.newProxyInstance(
        object.getClass().getClassLoader(),
        object.getClass().getInterfaces(),
        new DynamicProxy(object));
  }
}
