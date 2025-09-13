package org.example.Singleton;

public class SingletonMaiin
{
    public static void main(String[] args) {
        MainSingleton m1=MainSingleton.getSingletonInstance();
        MainSingleton m2=MainSingleton.getSingletonInstance();
        MainSingleton m3=MainSingleton.getSingletonInstance();
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

    }
}
