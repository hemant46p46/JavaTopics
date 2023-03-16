public class CreateThreadTest1 {
    public static void main(String[] args) {
        /* Type 1 */
        TestA obj = new TestA();
        obj.start();


        /* Type 2 */
        TestB b = new TestB();
        Thread t1 = new Thread(b);
        t1.start();

        /* Type 3 */
        Runnable r = new TestB();
        Thread t2 = new Thread(r);
        t2.start();

        /* Type 4 */

        Thread th1 = new Thread(){
          public void run(){
              System.out.println("Anonymous Thread is Running");
          }
        };
        th1.start();


        /* Type 5 */
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable Interface is Running");
            }
        };
        Thread thread = new Thread(r1);
        thread.start();
    }
}
class TestA extends Thread{
    public void run(){
        System.out.println("Thread is Running.. ");
    }
}

class TestB implements Runnable{
    public void run(){
        System.out.println("Thread Using Runnable interface");
    }
}