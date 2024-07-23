package hello.core.singleton;

public class StatefulSingleton {
    private static StatefulSingleton instance;
    private int count = 0;

    private StatefulSingleton() {}

    public static synchronized StatefulSingleton getInstance() {
        if (instance == null) {
            instance = new StatefulSingleton();
        }
        return instance;
    }

    public synchronized void incrementCount() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

