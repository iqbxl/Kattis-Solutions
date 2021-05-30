public class Heliocentric {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int cases = 1;
        while (io.hasMoreTokens()) {
            int e = io.getInt();
            int m = io.getInt();
            int days = 0;
            while (e != 0 || m != 0) {
                e = (e + 1) % 365;
                m = (m + 1) % 687;
                days++;
            }
            io.println("Case " + cases + ": " + days);
            cases++;
        }
        io.flush();
    }
}
