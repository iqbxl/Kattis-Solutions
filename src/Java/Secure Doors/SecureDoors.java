import java.util.Set;
import java.util.HashSet;

public class SecureDoors {

    private static Set<String> map;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        map = new HashSet<>();
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            String[] line = io.getLine().split(" ");
            String description = line[0];
            String name = line[1];
            if (description.equals("entry")) {
                if (!map.contains(name)) {
                    map.add(name);
                    io.println(name + " entered");
                } else {
                    io.println(name + " entered (ANOMALY)");
                }
            } else {
                if (map.contains(name)) {
                    map.remove(name);
                    io.println(name + " exited");
                } else {
                    io.println(name + " exited (ANOMALY)");
                }
            }
        }
        io.flush();
    }
}