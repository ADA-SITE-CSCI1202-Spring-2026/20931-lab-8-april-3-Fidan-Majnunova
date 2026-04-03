import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Collections;
public class task3 {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Fidan", 20);
        ages.put("Nihat", 22);
        ages.put("Daniz", 18);
        ages.put("Xeyale", 43);
        ages.put("Leyla", 21);
        System.out.println("Using for-each:");
        for (Map.Entry<String, Integer> e : ages.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
// iterator
        System.out.println("\nUsing iterator:");
        Iterator<Map.Entry<String, Integer>> it = ages.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
// toString
        System.out.println("\nUsing toString:");
        System.out.println(ages);
// different maps
        Map<String, Integer> h = new HashMap<>();
        Map<String, Integer> l = new LinkedHashMap<>();
        Map<String, Integer> t = new TreeMap<>();
        h.putAll(ages);
        l.putAll(ages);
        t.putAll(ages);
        System.out.println("\nHashMap: " + h);
        System.out.println("LinkedHashMap: " + l);
        System.out.println("TreeMap: " + t);
// reverse TreeMap
        Map<String, Integer> rev = new TreeMap<>(Collections.reverseOrder());
        rev.putAll(ages);
        System.out.println("Reverse TreeMap: " + rev);

        // sort by values descending
        System.out.println("\nSorted by age (descending):");

        List<Map.Entry<String, Integer>> list = new ArrayList<>(ages.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}