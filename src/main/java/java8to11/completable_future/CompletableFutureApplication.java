package java8to11.completable_future;

import java.util.concurrent.*;

public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    Callable<String> task =
        () -> {
          Thread.sleep(2000L);
          return "Hello";
        };

    Future<String> future = executorService.submit(task);
    System.out.println(future.isDone());
    System.out.println("Started");

    future.cancel(false);

    System.out.println(future.isDone());
    System.out.println("End");

    executorService.shutdown();
  }
}
