package java8to11.completable_future;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CompletableFutureApplication {
  public static void main(String[] args) {
    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    executorService.scheduleAtFixedRate(getRunnable("Hello"), 0, 3, TimeUnit.SECONDS);
    executorService.scheduleAtFixedRate(getRunnable("Hi"), 0, 1, TimeUnit.SECONDS);
  }

  private static Runnable getRunnable(String message) {
    return () -> System.out.println(message + " : " + Thread.currentThread().getName());
  }
}

