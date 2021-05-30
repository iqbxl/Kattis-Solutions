public class TrackSmoothing {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        while (t-- > 0) {
            int radius = io.getInt();
            int points = io.getInt();
            double minCirc = 2 * Math.PI * radius;
            
            double trackLength = 0;
            int[] x = new int[points];
            int[] y = new int[points];
            
            for (int i = 0; i < points; i++) {
                x[i] = io.getInt();
                y[i] = io.getInt();
            }

            int dx;
            int dy;
            for (int i = 1; i < points; i++) {
                dx = x[i] - x[i - 1];
                dy = y[i] - y[i - 1];
                trackLength += Math.sqrt(dx * dx + dy * dy);
            }
            // handle last 2 points: first and last x,y in array.
            dx = x[0] - x[points - 1];
            dy = y[0] - y[points - 1];
            trackLength += Math.sqrt(dx * dx + dy * dy);

            if (trackLength < minCirc) {
                io.println("Not possible");
            } else {
                io.println((trackLength - minCirc) / trackLength);
            }
        }
        io.flush();
    }
}