interface printable{
    default void print() {

    }
}
class A6 implements printable{
    @Override
    public void print() {
        System.out.println("Hello");
    }
}
public class InterfaceTest1 {
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }

}
