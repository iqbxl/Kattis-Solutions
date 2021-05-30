import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class SymmetricOrder {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        Queue<String> queue = new LinkedList<String>();
        Stack<String> stack = new Stack<String>();
        int n, idx = 1;
        while ((n = io.getInt()) != 0) {
            for (int i = 1; i < n + 1; i++) {
                  if ((i & 0x1) == 0x1) {
                      queue.add(io.getWord());
                  } else {
                      stack.push(io.getWord());
                  }
            }
            io.printf("SET %d\n", idx++);
            while (!queue.isEmpty()) {
                io.println(queue.poll());
            }
            while (!stack.isEmpty()) {
                io.println(stack.pop());
            }
        }
        io.flush();
    }
}