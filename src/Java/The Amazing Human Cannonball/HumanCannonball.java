public class HumanCannonball {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            double v = io.getDouble(), angleRad = Math.toRadians(io.getDouble()), x = io.getDouble(),
                   h1 = io.getDouble(), h2 = io.getDouble();
            double t = x / v / Math.cos(angleRad);
            double y = v * t * Math.sin(angleRad) - 1.0 / 2 * 9.81 * t * t;
            if (y >= h1 + 1 && y <= h2 - 1) {
                io.println("Safe");
            } else { 
                io.println("Not Safe");
            }
        }
        io.flush();
    }
}