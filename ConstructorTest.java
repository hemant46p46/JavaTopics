public class ConstructorTest {
    ConstructorTest(){
        System.out.println("No arg Constructor..");
    }
    ConstructorTest getObj(){
        return this;
    }
    void msg(){
        System.out.println("Hello Mr Java");
    }
    /*
    ConstructorTest(int n){
        this(3, 6);
        System.out.println("One arg Constructor..");
    }
    ConstructorTest(int n, int m){
        this(6, 3, 8);
        System.out.println("Two arg Constructor..");
    }
    ConstructorTest(int n, int m, int o){
        this(3, 5, 6, 7);
        System.out.println("Three arg Constructor..");
    }
    ConstructorTest(int n, int m, int o, int p){
//        this();
        System.out.println("Four arg Constructor..");
    }
*/
    public static void main(String[] args) {
        new ConstructorTest().msg();
    }
}
