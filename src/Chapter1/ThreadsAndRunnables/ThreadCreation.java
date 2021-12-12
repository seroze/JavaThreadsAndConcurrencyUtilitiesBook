package Chapter1.ThreadsAndRunnables;

public class ThreadCreation {

  public static void main(String[] args) {

    way1();
  }

  public static void way1(){
    Runnable r = new Runnable() {
      @Override
      public void run() {
        //perform some work
        System.out.println("Hello from thread");
      }
    };

    Thread t = new Thread(r);

    Thread t1 = new Thread(r, "thread t1");
    System.out.println(t1.getName());//Output: thread t1
    System.out.println(t1.getId());
    Thread t2 = new Thread(r);
    t2.setName("thread t2");
    System.out.println(t2.getName());//Output: thread t2
    System.out.println(t2.getId());


  }

  public static void way2(){
    Runnable r = ()-> System.out.println("Hello from Thread");
    Thread t = new Thread(r);

  }

  public static void way3(){

    class MyThread extends Thread{

      public void run(){
        System.out.println("Hello from thread");
      }
    }

    MyThread mt = new MyThread();

  }
}
