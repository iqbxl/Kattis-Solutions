import java.util.TreeSet;

public class FlyingSafely {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        while (t-- > 0) {
            int n = io.getInt(), m = io.getInt();
            TreeSet<Integer> num = new TreeSet<>();
            for (int i = 0; i < m * 2; i++) {
                num.add(io.getInt());
            }
            io.println(num.last() - 1);
        }
        io.flush();
    }
}