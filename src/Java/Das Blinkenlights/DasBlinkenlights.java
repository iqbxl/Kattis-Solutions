public class DasBlinkenlights {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt();
        int q = io.getInt();
        int s = io.getInt();
        if (lcm(p, q) <= s) {
            io.print("yes");
        } else {
            io.print("no");
        }
        io.flush();
    }

    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}