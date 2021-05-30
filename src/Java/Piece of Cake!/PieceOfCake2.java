public class PieceOfCake2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), h = io.getInt(), v = io.getInt();
        if (h < n / 2.0 && v < n / 2.0) {
            io.println((n - h) * (n - v) * 4);
        } else if (h < n / 2.0 && v >= n / 2.0) {
            io.println((n - h) * v * 4);
        } else if (h >= n / 2.0 && v < n / 2.0) {
            io.println(h * (n - v) * 4);
        } else {
            io.println(h * v * 4);
        }
        io.flush();
    }
}