import java.util.Map;
import java.util.TreeMap;

public class UnbearableZoo {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int list = 1;
        while (n != 0) {
            Map<String, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                String animal = io.getLine();
                String kind = animal.substring(animal.lastIndexOf(" ") + 1).toLowerCase(); // get last word in a string
                if (!map.containsKey(kind)) {
                    map.put(kind, 1);
                } else {
                    map.put(kind, map.get(kind) + 1);
                }
            }
            io.println("List " + list + ":");
            for (String animal : map.keySet()) {
                io.println(animal + " | " + map.get(animal));
            }
            list++;
            n = io.getInt();
        }
        io.flush();
    }
}