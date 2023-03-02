package java8to11.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(4);

    CompletableFuture<Void> future =
        CompletableFuture.supplyAsync(
                () -> {
                  System.out.println("Hello : " + Thread.currentThread().getName());
                  return "Hello";
                },
                executorService)
            .thenRun(
                () -> {
                  System.out.println("Hello : " + Thread.currentThread().getName());
                });
  }
}
