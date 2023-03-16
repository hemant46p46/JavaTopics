public class DeadlockTest2 {
    public static void main(String[] args) {
     /*   DeadlockTest2 test = new DeadlockTest2();*/

        final resource1 a = new resource1();
        final resource2 b = new resource2();


        Thread th1 = new Thread(() -> {
            synchronized (b){
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (a){
                    System.out.println("In block 1");
                }
            }
        });

        Thread th2 = new Thread(()->{
            synchronized (b){
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (a){
                    System.out.println("In Block 2");
                }
            }
        });




        th1.start();
        th2.start();

    }

    private static class resource1{
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    private static class resource2{
        private int i = 20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}