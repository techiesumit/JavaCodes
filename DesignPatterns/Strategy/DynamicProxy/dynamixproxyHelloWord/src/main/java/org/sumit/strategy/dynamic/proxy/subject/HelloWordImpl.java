package org.sumit.strategy.dynamic.proxy.subject;

public class HelloWordImpl implements HelloWorld{
    @Override
    public String sayHello(String arg) {
        return "This is Dynamic Proxy Invocation "+arg;
    }
}
