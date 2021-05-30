import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Sort { // Using normal radix sort won't work as we want to sort elements by frequency
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), c = io.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = io.getInt();
        }
        Map<Integer, Integer> mapFreq = new LinkedHashMap<>(); // LinkedHashMap maintains insertion order of elems
        for (int i = 0; i < n; i++) {                          // contains elements as keys and frequency as values
            if (!mapFreq.containsKey(arr[i])) {
                mapFreq.put(arr[i], 1);
            } else {
                mapFreq.put(arr[i], mapFreq.get(arr[i]) + 1);
            }
        }
        // Construct array list which contains ALL Entry objects of mapFreq
        ArrayList<Entry<Integer, Integer>> entryList = new ArrayList<>(mapFreq.entrySet());
        Collections.sort(entryList, new Comparator<Entry<Integer, Integer>>() { // overloaded sort method(Entry obj)
            @Override                                                           // by passing customised Comparator
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // entryList will now hold elements and their
            }                                                  // frequency sorted based on frequency
        });                                                    // if switch o1 and o2, means sort decreasing
        for (Entry<Integer, Integer> entry : entryList) {
            int frequency = entry.getValue();
            while (frequency >= 1) {
                io.print(entry.getKey() + " ");
                frequency--;
            }
        }
        io.flush();
    }
}