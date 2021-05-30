import java.util.Stack;

public class ARationalSequence3 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt();
        while (p-- > 0) {
            int k = io.getInt();
            int n = io.getInt();
            Stack<Boolean> location = new Stack<>();
            while (n != 1) {
                if ((n & 1) != 0) { // if n is not even, mark as false. if even -> true
                    location.push(false);
                } else {
                    location.push(true);
                }
                n >>= 1; // equivalent to x /= 2
            }
            int num = 1;
            int den = 1;
            while (location.size() != 0) {
                boolean instruction = location.peek();
                location.pop(); // this method returns element at top of stack and then removes it
                if (instruction) {
                    den += num;
                } else {
                    num += den;
                }
            }
            io.println(k + " " + num + "/" + den);
        }
        io.flush();
    }
}