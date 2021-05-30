import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class ShoppingListEasy {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int m = io.getInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = io.getLine().split(" ");
            for (int j = 0; j < m; j++) {
                if (!map.containsKey(line[j])) {
                    map.put(line[j], 1);
                } else {
                    map.put(line[j], map.get(line[j]) + 1);
                }
            }
        }
        Set<String> set = new TreeSet<>();
        for (String s : map.keySet()) {
            if (map.get(s) == n) {
                set.add(s);
            }
        }
        io.println(set.size());
        for (String s : set) {
            io.println(s);
        }
        io.flush();
    }
}