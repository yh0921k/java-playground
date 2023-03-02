package java8to11.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    boolean throwError = true;

    CompletableFuture<String> hello =
        CompletableFuture.supplyAsync(
                () -> {
                  if (throwError) {
                    throw new IllegalArgumentException();
                  }
                  System.out.println("Hello : " + Thread.currentThread().getName());
                  return "Hello";
                })
            .exceptionally(ex -> "Error!");

    System.out.println("hello.get() = " + hello.get());
  }
}
