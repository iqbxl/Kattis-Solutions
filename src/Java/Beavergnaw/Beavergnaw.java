public class Beavergnaw {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (io.hasMoreTokens()) {
            double D = io.getInt(), V = io.getInt();
            if (D == 0 && V == 0) break;
            double Vleft = Math.PI * Math.pow(D, 3) / 4 - V * 1.5;
            io.println(Math.pow((4 * Vleft / Math.PI), 1.0 / 3));
        }
        io.flush();
    }
}