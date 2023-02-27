package java8to11.completable_future;

public class CompletableFutureApplication {
  public static void main(String[] args) throws Exception {

    Thread thread = new Thread(() -> {
      while (true) {
        System.out.println("Thread : " + Thread.currentThread().getName());
        try {
          Thread.sleep(1000L);
        } catch (InterruptedException e) {
          System.out.println("Exit");
          return;
        }
      }
    });
    thread.start();

    System.out.println(Thread.currentThread().getName()); // main thread
    Thread.sleep(3000L);
    thread.interrupt();
  }
}

