package org.sumit.strategy.dynamic.proxy.concept.runner;

import org.sumit.strategy.dynamic.proxy.concept.model.Shape;
import org.sumit.strategy.dynamic.proxy.concept.proxies.ShapeFactory;
import org.sumit.strategy.dynamic.proxy.concept.proxies.ShapeFactoryImpl;
import org.sumit.strategy.dynamic.proxy.concept.proxies.ShapesType;

public class DynamicProxyRunner {
    public static void main(String[] args) {
        Shape shape;
        ShapeFactory shapeFactory = new ShapeFactoryImpl();
        shape=shapeFactory.getShapeInstance(ShapesType.CIRCLE);
        shape.drawShape();

    }
}
