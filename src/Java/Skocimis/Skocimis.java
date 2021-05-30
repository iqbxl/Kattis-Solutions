public class Skocimis {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt(), b = io.getInt(), c = io.getInt();
        io.println(Math.max(b - a, c - b) - 1);
        io.flush();
    }
}