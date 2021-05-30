public class Bus {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        while (t-- > 0) {
            double k = io.getInt(), res = 0;
            while (k-- > 0) {
                res = (res + 0.5) * 2;
            }
            io.println((int) res);
        }
        io.flush();
    }
}