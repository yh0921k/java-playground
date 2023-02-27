package java8to11.completable_future;

public class CompletableFutureApplication {
  public static void main(String[] args) throws Exception {

    Thread thread = new Thread(() -> {
      System.out.println("Thread : " + Thread.currentThread().getName());
      try {
        Thread.sleep(3000L);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e);
      }
    });
    thread.start();

    System.out.println(Thread.currentThread().getName()); // main thread
    thread.join();
    System.out.println(thread + " is finished");
  }
}

