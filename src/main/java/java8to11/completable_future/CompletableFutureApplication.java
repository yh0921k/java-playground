package java8to11.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> java = new CompletableFuture<>();
    java.complete("Java");
    System.out.println("future.get() = " + java.get());

    CompletableFuture<String> hello = CompletableFuture.completedFuture("Hello");
    System.out.println("hello.get() = " + hello.get());
  }
}
