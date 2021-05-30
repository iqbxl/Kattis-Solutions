public class Prsteni {
    public static int hcf(int a, int b) { //recursive implementation for highest common factor
        if (a == b) {                     //no need to consider when a == 0 || b == 0
            return a;
        }
        if (a > b) {
            return hcf(a - b, b);
        } else {
            return hcf(a, b - a);
        }
    }
    public static void main(String[] x) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), first = io.getInt();
        while (n-- > 1) {
            int radius = io.getInt();
            int gcd = hcf(first, radius);
            io.println(first / gcd + "/" + radius / gcd);
        }
        io.flush();
    }
}