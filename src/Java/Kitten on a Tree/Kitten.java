import java.util.Map;
import java.util.HashMap;

public class Kitten {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String k = io.getWord(); // easier to work with string
        Map<String, String> map = new HashMap<>();
        while (true) {
            String line = io.getLine();
            if (line.equals("-1")) {
                break;
            }
            String[] branch = line.split(" ");
            for (int i = 1; i < branch.length; i++) {
                map.put(branch[i], branch[0]); // HashMap does not allow duplicate keys BUT allows duplicate values
            }
        }
        while (true) {
            io.print(k + " ");
            if (!map.containsKey(k)) {
                break;
            }
            k = map.get(k);
        }
        io.flush();
    }
}