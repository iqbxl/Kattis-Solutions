public class Rijeci {
    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int a = 0, b = 1, res = 0;
            for (int i = 1; i < n; i++) {
                res = a + b;
                a = b;
                b = res;
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int k = io.getInt();
        io.println(Fibonacci(k - 1) + " " + Fibonacci(k));
        io.flush();
    }
}