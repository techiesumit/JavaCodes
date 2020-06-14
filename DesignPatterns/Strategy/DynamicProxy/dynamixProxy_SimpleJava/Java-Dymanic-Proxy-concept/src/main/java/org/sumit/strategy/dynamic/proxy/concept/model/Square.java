package org.sumit.strategy.dynamic.proxy.concept.model;

public class Square implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing Square : <> <>");
    }
}
