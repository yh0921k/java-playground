package java8to11.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> hello =
        CompletableFuture.supplyAsync(
            () -> {
              System.out.println("Hello : " + Thread.currentThread().getName());
              return "Hello";
            });

    CompletableFuture<String> future = hello.thenCompose(CompletableFutureApplication::getMessage);
    System.out.println("future.get() = " + future.get());
  }

  private static CompletableFuture<String> getMessage(String message) {
    return CompletableFuture.supplyAsync(
        () -> {
          System.out.println("World : " + Thread.currentThread().getName());
          return message + "World";
        });
  }
}
