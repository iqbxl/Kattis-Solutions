public class ShatteredCake {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int w = io.getInt(), n = io.getInt(), area = 0;
        for (int i = 0; i < n; i++) {
            area += io.getInt() * io.getInt();
        }
        io.print(area / w);
        io.flush();
    }
}