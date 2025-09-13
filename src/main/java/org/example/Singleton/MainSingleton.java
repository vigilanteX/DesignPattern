package org.example.Singleton;

public class MainSingleton {
    private static MainSingleton mainSingleton;

    private MainSingleton() {
    }

    public static MainSingleton getSingletonInstance() {
        /*
        *
        * This if ensures performance by checking if one time object is created don't go inside and go for lock check.
        * As synchronize block cost performance issue. Kind of it will slow down app.
        * */
        if (mainSingleton == null) {
            synchronized (MainSingleton.class) {
                /*
                2nd if check to ensure if two threads enter let t1 and t2. And let t2 enters first so
                it will acquire lock and t1 waits, so once t2 creates object the lock will release and t1
                will also create new object and singleton breaks.
                * */
                if (mainSingleton == null) {
                    mainSingleton = new MainSingleton();

                }
            }

        }
        return mainSingleton;
    }
}
