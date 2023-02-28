package java8to11.completable_future;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CompletableFutureApplication {
  public static void main(String[] args) {
    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    executorService.schedule(getRunnable("Hello"), 3, TimeUnit.SECONDS);
    executorService.schedule(getRunnable("Hi"), 1, TimeUnit.SECONDS);

    executorService.shutdown();
  }

  private static Runnable getRunnable(String message) {
    return () -> System.out.println(message + " : " + Thread.currentThread().getName());
  }
}

