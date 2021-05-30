import java.util.HashSet;

public class BoatParts {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt(), n = io.getInt();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String part = io.getWord();
            if (!hs.contains(part)) {
                hs.add(part);
            }
            if (hs.size() == p) {
                io.print(i + 1);
                break;
            }
        }
        if (hs.size() < p) {
            io.print("paradox avoided");
        }
        io.flush();
    }
}