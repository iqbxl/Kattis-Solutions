public class LastFactorialDigit {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        for (int i = 0; i < t; i++) {
            io.println(factorial(io.getInt()) % 10);
        }
        io.flush();
    }
}