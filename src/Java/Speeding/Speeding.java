public class Speeding {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int tPrev = io.getInt();
        int dPrev = io.getInt();
        int maxSpeed = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            int t = io.getInt();
            int d = io.getInt();
            maxSpeed = Math.max(maxSpeed, (d - dPrev) / (t - tPrev));
            tPrev = t;
            dPrev = d;
        }
        io.print(maxSpeed);
        io.flush();
    }
}