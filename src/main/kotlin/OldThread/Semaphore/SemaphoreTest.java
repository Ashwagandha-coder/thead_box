package OldThread.Semaphore;

import java.util.concurrent.Semaphore;

/**
 Данный класс нужен для демонстрации работы с семафором
 */

public class SemaphoreTest extends Semaphore {

    private Semaphore semaphore = new Semaphore(0);

    public SemaphoreTest(int permits) {
        super(permits);
    }

    public SemaphoreTest(int permits, boolean fair) {
        super(permits, fair);
    }


    public void work() throws InterruptedException {

        semaphore.acquire();

        Object object = new Object();


    }
}
