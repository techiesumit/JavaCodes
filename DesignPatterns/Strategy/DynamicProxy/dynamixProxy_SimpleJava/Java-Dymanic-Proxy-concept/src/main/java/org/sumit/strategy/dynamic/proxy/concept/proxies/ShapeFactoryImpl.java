package org.sumit.strategy.dynamic.proxy.concept.proxies;

import org.sumit.strategy.dynamic.proxy.concept.model.Circle;
import org.sumit.strategy.dynamic.proxy.concept.model.Shape;
import org.sumit.strategy.dynamic.proxy.concept.model.Square;
import org.sumit.strategy.dynamic.proxy.concept.model.Triangle;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShapeFactoryImpl implements ShapeFactory {
    private Map<ShapesType, Class<? extends Shape>> map = Stream.of(
            new AbstractMap.SimpleImmutableEntry<>(ShapesType.CIRCLE, Circle.class),
            new AbstractMap.SimpleImmutableEntry<>(ShapesType.TRIANGLE, Triangle.class),
            new AbstractMap.SimpleImmutableEntry<>(ShapesType.SQUARE, Square.class))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


    @Override
    public Shape getShapeInstance(ShapesType shapesType) {
        return (Shape) new ShapesDynamicFactory().createObject(map.get(shapesType));
    }
}
