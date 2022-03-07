package com.abstractfactory;

public class ShapeFactory extends AbstractFactory
{
    @Override
    public Colour getColor(String color){
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return null;
    }
}