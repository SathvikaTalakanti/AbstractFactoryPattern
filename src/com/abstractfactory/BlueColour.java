package com.abstractfactory;

public class BlueColour implements Colour
{
    @Override
    public void fill()
    {
        System.out.println("Blue Colour is filled");
    }
}