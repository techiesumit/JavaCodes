package org.sumit.strategy.dynamic.proxy.concept.proxies;

import org.sumit.strategy.dynamic.proxy.concept.model.Shape;

public interface ShapeFactory {
    public Shape getShapeInstance(ShapesType shapesType);
}
