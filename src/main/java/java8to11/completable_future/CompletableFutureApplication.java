package java8to11.completable_future;

public class CompletableFutureApplication {
  public static void main(String[] args){

    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread : " + Thread.currentThread().getName());
      }
    });

    thread.start();

    System.out.println(Thread.currentThread().getName()); // main thread

  }
}

