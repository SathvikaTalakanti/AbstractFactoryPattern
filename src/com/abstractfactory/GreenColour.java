package com.abstractfactory;

public class GreenColour implements Colour
{
    @Override
    public void fill() {
        System.out.println("Green colour is filled");
    }
}