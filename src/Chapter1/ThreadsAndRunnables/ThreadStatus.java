package Chapter1.ThreadsAndRunnables;


/*
    public static Thread.State toThreadState(int threadStatus) {
        if ((threadStatus & JVMTI_THREAD_STATE_RUNNABLE) != 0) {
            return RUNNABLE;
        } else if ((threadStatus & JVMTI_THREAD_STATE_BLOCKED_ON_MONITOR_ENTER) != 0) {
            return BLOCKED;
        } else if ((threadStatus & JVMTI_THREAD_STATE_WAITING_INDEFINITELY) != 0) {
            return WAITING;
        } else if ((threadStatus & JVMTI_THREAD_STATE_WAITING_WITH_TIMEOUT) != 0) {
            return TIMED_WAITING;
        } else if ((threadStatus & JVMTI_THREAD_STATE_TERMINATED) != 0) {
            return TERMINATED;
        } else if ((threadStatus & JVMTI_THREAD_STATE_ALIVE) == 0) {
            return NEW;
        } else {
            return RUNNABLE;
        }
    }

    NEW => A thread that has not yet started is in this state
    RUNNABLE => A thread executing  in the JVM is in this state
    BLOCKED => A thread that is blocked waiting for a monitor lock is in this state
    WAITING => A thread that is waiting indefinitely for another thread to perform a particular action is in this state
    TIMED_WAITING => A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state
    TERMINATED => A thread that has exited is in this state
 */
public class ThreadStatus {
  public static void main(String[] args) {

    Thread t1 = new Thread(()-> System.out.println("Hello from thread"));
    System.out.println(t1.getName());
    System.out.println(t1.getId());
    System.out.println(t1.isAlive()+" isAlive  ?");
    System.out.println(t1.getState()+" thread state");
    System.out.println(Runtime.getRuntime().availableProcessors()+ " available processors");


    daemonThread();
  }

  /*
  Java let's you classify threads as daemon threads or nondaemon threads. A daemon thread is a thread that acts as a helper to a nondaemon
  thread and dies automatically when the applications last non-daemon thread dies so that the application can terminate

   To determine if a thread is daemon or nondaemon we can call Threads isDaemon() method

   By default, the threads, associated with Thread Objects are non-daemon threads. To create a daemon thread, you must call Thread's
   setDaemon(boolean isDaemon) method, passing true .

   */
  public  static void daemonThread(){

    Thread t2 = new Thread(()-> System.out.println("Hello from thread"));
    System.out.println(t2.isDaemon());//Output: false

    t2.setDaemon(true);
    System.out.println(t2.isDaemon());//Output: true

  }
}
