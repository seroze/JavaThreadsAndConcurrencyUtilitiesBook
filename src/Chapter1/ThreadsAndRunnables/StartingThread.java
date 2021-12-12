package Chapter1.ThreadsAndRunnables;

public class StartingThread {

  public static void main(String[] args) {
    Thread t = new Thread(()-> System.out.println("hello from thread"));
    t.start();
    /*
     Calling start() results in the runtime creating the underlying thread and scheduling it for subsequent execution, in which
     runnable's run() method is invoked, When execution leaves run(), the thread is destroyed and the Thread object on which start() was called
     is no longer available, which is why calling start() results in IllegalThreadStateException
      => Then why are we not declaring an exception here, cause it's an unchecked exception
     */

    //t.start(); adding this line will cause IllegalThreadStateException

    main2();

  }

  public static  void main2(){

    Runnable r = new Runnable() {
      @Override
      public void run() {
        Thread thd = Thread.currentThread();
        while (true) System.out.printf("%s is %s alive and in %s state %n", thd.getName(), thd.isAlive()?"":"not", thd.getState());
      }
    };


    Thread t1= new Thread(r, "thd1");
  }


}
