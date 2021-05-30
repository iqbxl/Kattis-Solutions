import java.util.List;
import java.util.ArrayList;

public class BookingARoom {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        List<Integer> list = new ArrayList<>();
        int r = io.getInt(), n = io.getInt();
        if (r == n) {
            io.print("too late");
        }
        for (int i = 0; i < n; i++) {
            list.add(io.getInt());
        }
        for (int i = 1; i <= r; i++) {
            if (!list.contains(i)) {
                io.print(i);
                break;
            }
        }
        io.flush();
    }
}