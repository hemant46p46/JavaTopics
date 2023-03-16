public class DeadlockTest {
    public static void main(String[] args) {
        final String resource1 = "Hemant Patel";
        final String resource2 = "Deepak Patel";

        Thread th1 = new Thread(() -> {
            synchronized (resource1){
                System.out.println("Thread 1 : locked resource1");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        Thread th2 = new Thread(() -> {
            synchronized (resource2){
                System.out.println("Thread 2 : locked resource 2");
                try {
                    Thread.sleep(10000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        th1.start();
        th2.start();

    }
}