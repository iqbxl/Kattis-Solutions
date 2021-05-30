import java.util.Collections;
import java.util.ArrayList;

public class Statistics {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int k = 1;
        while (true) {
            if (!io.hasMoreTokens()) {
                break;
            }
            int n = io.getInt();
            ArrayList<Integer> A = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                A.add(io.getInt());
            }
            Collections.sort(A);
            int min = A.get(0), max = A.get(A.size() - 1);
            io.println("Case " + k++ + ": " + min + " " + max + " " + (max - min));
        }
        io.flush();
    }
}