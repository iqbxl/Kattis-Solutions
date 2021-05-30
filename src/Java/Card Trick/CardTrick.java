import java.util.Deque;
import java.util.LinkedList;

public class CardTrick {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        while (t-- > 0) {
            int n = io.getInt();
            Deque<Integer> deque = new LinkedList<>();
            deque.add(n);
            for (int i = n - 1; i > 0; i--) {
                deque.addFirst(i);
                for (int j = 0; j < i; j++) {
                    deque.push(deque.pollLast());
                }
            }
            for (int i : deque) {
                io.print(i + " ");
            }
            io.println();
        }
        io.flush();
    }
}