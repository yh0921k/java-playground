package java8to11.completable_future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureApplication {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    executorService.submit(getRunnable("Hello"));
    executorService.submit(getRunnable("Hi"));
    executorService.submit(getRunnable("Java"));
    executorService.submit(getRunnable("Thread"));
    executorService.submit(getRunnable("ExecutorService"));

    executorService.shutdown();
  }

  private static Runnable getRunnable(String message) {
    return () -> System.out.println(message + " : " + Thread.currentThread().getName());
  }
}

