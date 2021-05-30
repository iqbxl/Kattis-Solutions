import java.util.HashSet;
import java.util.Set;

public class Cetvrta {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            int x = io.getInt(), y = io.getInt();
            if (!set1.contains(x)) {
                set1.add(x);
            } else {
                set1.remove(x);
            }
            if (!set2.contains(y)) {
                set2.add(y);
            } else {
                set2.remove(y);
            }
        }
        for (int x : set1) {
            io.print(x + " ");
        }
        for (int y : set2) {
            io.print(y);
        }
        io.flush();
    }
}