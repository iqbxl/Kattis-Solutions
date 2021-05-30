import java.util.HashSet;

public class Modulo {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            h.add(io.getInt() % 42);
        }
        io.print(h.size());
        io.flush();
    }
}