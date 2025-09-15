package org.example.FactoryPattern;

public class AndroidDevEmployee implements IEmployee {
    @Override
    public int salary() {
        System.out.println("ANDROID DEV");
        return 76543;
    }
}
