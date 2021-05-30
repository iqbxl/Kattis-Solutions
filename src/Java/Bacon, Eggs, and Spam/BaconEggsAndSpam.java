import java.util.Map;
import java.util.TreeMap; // TreeMap sort keys lexicographically
import java.util.TreeSet; // TreeSet sorts the items lexicographically

public class BaconEggsAndSpam {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int n = io.getInt();
            if (n == 0) break;
            Map<String, TreeSet<String>> map = new TreeMap<>(); // create Map to store 1 key with multiple values
            for (int i = 0; i < n; i++) {                       // and TreeMap stores menu items lexicographically
                String[] input = io.getLine().split(" ");
                for (int j = 1; j < input.length; j++) {
                    if (!map.containsKey(input[j])) {
                        TreeSet<String> names = new TreeSet<>(); // create TreeSet to store names in order
                        names.add(input[0]);
                        map.put(input[j], names);
                    } else {
                        TreeSet<String> names = map.get(input[j]);
                        names.add(input[0]);
                        map.put(input[j], names);
                    }
                }
            }
            for (Map.Entry<String, TreeSet<String>> entry : map.entrySet()) {
                String res = entry.getKey();
                for (String s : entry.getValue()) {
                    res += " " + s;
                }
                io.println(res);
            }
            io.println();
        }
        io.flush();
    }
}