public class NumberFun {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            double a = io.getDouble(), b = io.getDouble(), c = io.getDouble();
            if (a + b == c || a * b == c || a - b == c || b - a == c || a / b == c || b / a == c) {
                io.println("Possible");
            } else {
                io.println("Impossible");
            }
        }
        io.flush();
    }
}