package java8to11.completable_future;

public class CompletableFutureApplication {
  public static void main(String[] args){

    Thread myThread = new MyThread();
    myThread.start();

    System.out.println(Thread.currentThread().getName()); // main thread

  }

  static class MyThread extends Thread {
    @Override
    public void run() {
      System.out.println("Thread : " + Thread.currentThread().getName());
    }
  }
}

