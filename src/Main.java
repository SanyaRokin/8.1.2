import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService  executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<MyCallable> myCallableList = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            myCallableList.add(new MyCallable());
        }
        Integer result = executorService.invokeAny(myCallableList);
        System.out.println("Количество отправленных сообщений:" + result);
        executorService.shutdown();
    }
}
