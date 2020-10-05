import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int call = 1;
        while (call <= 4) {
            System.out.println("Я поток - "+ Thread.currentThread().getName());
            Thread.sleep(1000);
            call++;
        }
        return call;
    }
}
