package org.example.FactoryPattern;

public class WebDevEmployee implements IEmployee
{
    @Override
    public int salary() {
        System.out.println("WEB DEV");
        return 23456;
    }
}
