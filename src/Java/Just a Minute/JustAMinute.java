public class JustAMinute {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), m = 0, s = 0;
        for (int i = 0; i < n; i++) {
            m += io.getInt();
            s += io.getInt();
        }
        double SLminute = s / 60.0 / m;
        io.print(SLminute > 1 ? SLminute : "measurement error");
        io.flush();
    }
}