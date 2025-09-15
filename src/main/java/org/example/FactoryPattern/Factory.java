package org.example.FactoryPattern;

public class Factory {
    public static IEmployee getEmployee(String role) {
        if (role.trim().equalsIgnoreCase("android"))
            return new AndroidDevEmployee();
        else if (role.trim().equalsIgnoreCase("web"))
            return new WebDevEmployee();
        else
            return null;
    }
}
