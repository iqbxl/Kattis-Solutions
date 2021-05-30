public class Sok {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        double a = io.getInt(), b = io.getInt(), c = io.getInt(),
               i = io.getInt(), j = io.getInt(), k = io.getInt();
        double smallestFrac = Math.min(Math.min(a / i, b / j), c / k);
        io.print((a - smallestFrac * i) + " " + (b - smallestFrac * j) + " " + (c - smallestFrac * k));
        io.flush();
    }
}