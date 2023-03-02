package java8to11.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<Void> future =
        CompletableFuture.supplyAsync(
                () -> {
                  System.out.println("Hello : " + Thread.currentThread().getName());
                  return "Hello";
                })
            .thenAccept(
                (s) -> {
                  System.out.println("Hello : " + Thread.currentThread().getName());
                });
  }
}
