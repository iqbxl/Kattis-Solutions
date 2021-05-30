public class Billiard {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int a = io.getInt(), b = io.getInt(), s = io.getInt(), m = io.getInt(), n = io.getInt();
            if (s == 0) break;
            double horz = a * m; // total distance covered horizontally
            double vert = b * n; // total distance covered vertically
            double resultant = Math.sqrt(horz * horz + vert * vert);
            double angle = Math.toDegrees(Math.atan(vert / horz));
            double velocity = resultant / s;
            io.println(String.format("%.2f %.2f", angle, velocity));
        }
        io.flush();
    }
}