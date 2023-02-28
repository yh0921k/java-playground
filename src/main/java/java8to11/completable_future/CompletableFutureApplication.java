package java8to11.completable_future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureApplication {
  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    executorService.submit(() -> System.out.println("Thread : " + Thread.currentThread().getName()));

    executorService.shutdown();
  }
}

