import java.util.HashSet;

public class FreeFood {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int s = io.getInt(), t = io.getInt();
            for (int j = s; j <= t; j++) {
                if (!hs.contains(j)) {
                    hs.add(j);
                }
            }
        }
        io.print(hs.size());
        io.flush();
    }
}