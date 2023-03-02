package java8to11.completable_future;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(3);

    Callable<String> hello =
        () -> {
          Thread.sleep(2000L);
          return "Hello";
        };

    Callable<String> java =
        () -> {
          Thread.sleep(3000L);
          return "Java";
        };

    Callable<String> callable =
        () -> {
          Thread.sleep(1000L);
          return "Callable";
        };

    String result = executorService.invokeAny(Arrays.asList(hello, java, callable));
    System.out.println("result = " + result);

    executorService.shutdown();
  }
}
