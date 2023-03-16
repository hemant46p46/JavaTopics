import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        ArrayListTest();
        /*
        *
        * */
    }

    public static void ArrayListTest(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);
        System.out.println(list1.contains(40));

        for (Integer integer : list1) {
            System.out.println(integer);
        }
        System.out.println("");
        list1.stream().forEach(System.out::println);
    }
}