package java8to11.completable_future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(2);

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

    List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, java, callable));
    for (Future<String> future : futures) {
      System.out.println("future.get() = " + future.get());
    }

    executorService.shutdown();
  }
}
