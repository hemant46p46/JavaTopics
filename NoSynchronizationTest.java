public class NoSynchronizationTest {
    public static void main(String[] args) {

        Table t = new Table();
        TableThread1 t1 = new TableThread1(t);
        TableThread2 t2 = new TableThread2(t);

        t1.setName("5 Table ");
        t1.setName(("1000 Table "));

        t1.start();
        t2.start();

        Thread th1 = new Thread(() -> t.printTable(7));
        Thread th2 = new Thread(){public void run(){t.printTable(19);}};

        th1.setName("7 Table ");
        th2.setName("19 Table");

        th1.start();
        th2.start();

    }
}
class TableThread1 extends Thread{ Table t;
    TableThread1(Table t){this.t = t;}
    public void run(){int n = 5;  t.printTable(n);}
}
class TableThread2 extends Thread{ Table t;
    TableThread2(Table t){this.t = t;}
    public void run(){int n = 1000;   t.printTable(n);}
}
class Table{
    void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " : " + n*i);}
        try{Thread.sleep(1000);}catch (Exception e){System.out.println(e);}
    }
}
