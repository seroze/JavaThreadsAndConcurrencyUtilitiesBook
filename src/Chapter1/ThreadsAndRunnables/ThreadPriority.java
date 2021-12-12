package Chapter1.ThreadsAndRunnables;

/*
When a computer has multiple cores (usually each core can process two threads), the computers OS assigns each thread to a core/processor so the
threads execute simultaneously, When a computer doesn't have enough processors and/or cores, various threads must wait their turn to use the
shared processors/cores.
 */
public class ThreadPriority {
  public static void main(String[] args) {
    Thread t = new Thread(()-> System.out.println("hello from thread"));

    System.out.println(t.getPriority());
    t.setPriority(Thread.MIN_PRIORITY);
    /*
    Using setPriority() can impact an applications portability across OS because different schedulers can handle a priority change
    in different ways, some os scheduler might delay lower priority threads from executing until higher priority threads finish, this
    delaying can cause indefinite postponement or starvation
     */
  }
}
