package hello.core.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StatefulSingletonTest {

    @Test
    public void testStatefulSingleton() throws InterruptedException {
        StatefulSingleton s1 = StatefulSingleton.getInstance();
        StatefulSingleton s2 = StatefulSingleton.getInstance();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                s1.incrementCount();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                s2.incrementCount();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int count = s1.getCount();
        System.out.println("Count: " + count);

        assertThat(count).isEqualTo(2000000);
    }
}