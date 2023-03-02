package java8to11.completable_future;

import java.util.concurrent.*;

public class CompletableFutureApplication {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    Callable<String> task = () -> {
      Thread.sleep(2000L);
      return "Hello";
    };

    Future<String> submit = executorService.submit(task);

    System.out.println("Started");
    String result = submit.get();
    System.out.println("result = " + result);
    System.out.println("End");

    executorService.shutdown();
  }
}

