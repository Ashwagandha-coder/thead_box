package OldThread.Call;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 Пример интерфейса callable and future
 */

public class CallTest {

    private Callable callable = () -> {
        return "";
    };

    private Future future;
    private FutureTask futureTask;

    public void make() {

        futureTask = new FutureTask(callable);
        new Thread(futureTask).start();

        try {
            String str = futureTask.get().toString();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


}
