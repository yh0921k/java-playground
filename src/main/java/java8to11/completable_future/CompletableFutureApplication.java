package java8to11.completable_future;

public class CompletableFutureApplication {
  public static void main(String[] args){

    Thread thread = new Thread(() -> {
      try {
        Thread.sleep(3000L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Thread : " + Thread.currentThread().getName());
    });
    thread.start();

    System.out.println(Thread.currentThread().getName()); // main thread

  }
}

