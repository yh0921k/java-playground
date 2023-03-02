package java8to11.completable_future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> hello =
        CompletableFuture.supplyAsync(
            () -> {
              System.out.println("Hello : " + Thread.currentThread().getName());
              return "Hello";
            });

    CompletableFuture<String> world =
        CompletableFuture.supplyAsync(
            () -> {
              System.out.println("World : " + Thread.currentThread().getName());
              return "World";
            });

    List<CompletableFuture<String>> futures = Arrays.asList(hello, world);
    CompletableFuture[] futuresArray = futures.toArray(new CompletableFuture[futures.size()]);

    CompletableFuture<List<String>> futureList =
        CompletableFuture.allOf(futuresArray)
            .thenApply(
                v -> futures.stream().map(CompletableFuture::join).collect(Collectors.toList()));

    List<String> results = futureList.get();
    for (String result : results) {
      System.out.println("result = " + result);
    }
  }
}
