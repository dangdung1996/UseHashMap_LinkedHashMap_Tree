import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("name1",10);
        hashMap.put("name2",20);
        hashMap.put("name3",30);
        hashMap.put("name4",40);
        hashMap.put("name5",50);
        hashMap.put("name6",20);
        hashMap.put("name7",10);
        System.out.println("Display enrties in HashMap");
        System.out.println(hashMap+ "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        linkedHashMap.put("name 1",10);
        linkedHashMap.put("name 2",20);
        linkedHashMap.put("name 3",30);
        linkedHashMap.put("name 4",40);

        System.out.println("\nThe age for " + "name3 is " + linkedHashMap.get("name3"));
    }
}
