import java.util.Set;
import java.util.HashSet;

public class Keywords {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        Set<String> set = new HashSet<>();
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            set.add(io.getLine().toLowerCase().replaceAll("-", " "));
        }
        io.print(set.size());
        io.flush();
    }
}