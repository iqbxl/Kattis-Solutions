public class JudgingMoose {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int left = io.getInt(), right = io.getInt();
        if (left == right && (left != 0 && right != 0)) {
            io.println("Even " + left * 2);
        } else if (left > right) {
            io.println("Odd " + left * 2);
        } else if (right > left) {
            io.println("Odd " + right * 2);
        } else {
            io.println("Not a moose");
        }
        io.flush();
    }
}