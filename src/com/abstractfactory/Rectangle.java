package com.abstractfactory;

public class Rectangle implements Shape
{
    @Override
    public void draw() {
        System.out.println("rectangle is drawn");
    }
}