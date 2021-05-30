import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class ShoppingList {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int m = io.getInt();
        Set<String> s1 = new TreeSet<>(); // intersection set
        String[] lineOne = io.getLine().split(" ");
        for (int i = 0; i < m; i++) {
            s1.add(lineOne[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            Set<String> s2 = new HashSet<>();
            String[] lineCompare = io.getLine().split(" ");
            for (int j = 0; j < m; j++) {
                s2.add(lineCompare[j]);
            }
            s1.retainAll(s2); // s1 now contains only elements in both sets
        }
        io.println(s1.size());
        for (String s : s1) {
            io.println(s);
        }
        io.flush();
    }
}