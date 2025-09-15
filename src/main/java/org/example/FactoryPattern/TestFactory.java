package org.example.FactoryPattern;

public class TestFactory
{
    public static void main(String[] args) {
        IEmployee employee= Factory.getEmployee("web");
        System.out.println(employee.salary());
    }
}
