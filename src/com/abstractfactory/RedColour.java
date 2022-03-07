package com.abstractfactory;

public class RedColour implements Colour
{
    @Override
    public void fill()
    {
        System.out.println("Red Colour is filled");
    }
}