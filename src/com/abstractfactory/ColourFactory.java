package com.abstractfactory;

public class ColourFactory extends AbstractFactory
{
    @Override
    Colour getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("blue")) {
            return new BlueColour();
        } else if (color.equalsIgnoreCase("green")) {
            return new GreenColour();
        } else if (color.equalsIgnoreCase("red")) {
            return new RedColour();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}