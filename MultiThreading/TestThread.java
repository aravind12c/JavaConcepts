package MultiThreading;
public class TestThread {

   public static void main(String args[]) {
	   Thread_RunnableDemo R1 = new Thread_RunnableDemo( "Thread-1");
      R1.start();
      
      Thread_RunnableDemo R2 = new Thread_RunnableDemo( "Thread-2");
      R2.start();
      Thread_RunnableDemo R3 = new Thread_RunnableDemo( "Thread-3");
      R3.start();
   }   
}