public class SynchronizationTest {
    public static void main(String[] args) {
        SynchronizedTable table = new SynchronizedTable();

        Thread th1 = new Thread(){
          public void run(){
              table.printTable(3);
          }
        };
        th1.setName("TABLE 3");

        Thread th2 = new Thread(() -> {
            table.printTable(7);
        });
        th2.setName("Table 7");

        Thread th3 = new Thread("Table 19"){
            @Override
            public void run() {
                table.printTable(19);
            }
        };

        th1.start();
        th2.start();
        th3.start();
    }
}
class SynchronizedTable{
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " : " + n*i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
