import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        hashMapTest();
    }
    private static void hashMapTest(){
        Map<Integer, String> countryCode = new HashMap<>();
        countryCode.put(91, "India");
        countryCode.put(12, "uk");
        countryCode.put(47, "USA");
        countryCode.put(90, "Canada");
        countryCode.put(65, "Russia");
        countryCode.putIfAbsent(91, "SriLanka");
        countryCode.put(91, "Bhutan");

//        System.out.println(countryCode);

//        System.out.println(countryCode.keySet());
        System.out.println(countryCode.remove(12));
        System.out.println(countryCode);
    }
    private static void linkedHashMapTest(){
        Map<Integer, String> cricketPlayers = new LinkedHashMap<>();
        cricketPlayers.put(45, "Rohit");
        cricketPlayers.put(7, "MSD");
        cricketPlayers.put(18, "Kohli");
        cricketPlayers.put(12, "Singh");

    }
    private static void TreeMapTest(){
        Map<Integer, String> footballPlayers = new TreeMap<>();
    }
}
