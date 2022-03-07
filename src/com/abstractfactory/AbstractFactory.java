package com.abstractfactory;

public abstract class AbstractFactory
{
    abstract Colour getColor(String color);
    abstract Shape getShape(String shape);
}