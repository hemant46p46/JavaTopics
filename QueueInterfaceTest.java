import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceTest {
    public static void main(String[] args) {
//        QueueTest();

        Queue<Book> BooksQueue = new PriorityQueue<>();

        Book b1 = new Book(321, "Physics", 8000);
        Book b2 = new Book(221, "Chemistry", 3000);
        Book b3 = new Book(121, "Math", 4000);
        Book b4 = new Book(421, "English", 1000);


        BooksQueue.add(b1);
        BooksQueue.add(b3);
        BooksQueue.add(b2);
        BooksQueue.add(b4);

        for (Book b: BooksQueue) {
            System.out.println(b.id + " : " + b.name + " : " + b.price);
        }

    }
    public static void QueueTest(){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.add(30);
        queue.add(90);
        queue.add(10);
        queue.add(60);
        System.out.println(queue);
    }


}

class Book implements Comparable<Book>{
    int id;
    String name;
    float price;
    Book(int i, String n, float p){
        this.id = i;
        this.name = n;
        this.price = p;
    }

    @Override
    public int compareTo(Book o) {
        if(id > o.id){
            return 1;
        }
        else if(id < o.id){
            return -1;
        }else{
            return 0;
        }
    }
}