import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceTest {
    public static void main(String[] args) {
        hashMapTest();
    }
    static void hashMapTest(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hemant");
        map.put(5, "Deepak");
        map.put(3, "Shivam");
        map.put(4, "Satya");

        /*map can't be traversed so we need to convert into set or keySet*/
        /*Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry<Integer, String> entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }*/
        System.out.println("\nPrinting map default");
        for(Entry m : map.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println("\nPrinting map BY sorting on basis of keys");
        map.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);


        System.out.println("\nPrinting map By sorting on basis of values");
        map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);

    }
}
