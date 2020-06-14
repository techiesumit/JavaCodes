package org.sumit.strategy.dynamic.proxy.runner;

import org.sumit.strategy.dynamic.proxy.factory.DynamicProxy;
import org.sumit.strategy.dynamic.proxy.factory.DynamicProxyFactory;
import org.sumit.strategy.dynamic.proxy.subject.HelloWordImpl;
import org.sumit.strategy.dynamic.proxy.subject.HelloWorld;

public class HelloWorldRunner {
  public static void main(String[] args) {
    HelloWorld helloWorld= DynamicProxyFactory.INSTANCE.createObjectByType(HelloWordImpl.class);
    System.out.println(helloWorld.sayHello("Proxie"));
  }
}
