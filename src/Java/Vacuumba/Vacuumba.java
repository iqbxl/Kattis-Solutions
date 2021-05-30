public class Vacuumba {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        while (n-- > 0) {
            int m = io.getInt();
            double dx = 0;
            double dy = 0;
            double temp = 90;
            for (int i = 0; i < m; i++) {
                
                double angle = io.getDouble();
                double distance = io.getDouble();
                
                temp += angle;
                dx += distance * Math.cos(Math.toRadians(temp));
                dy += distance * Math.sin(Math.toRadians(temp));
            }
            io.println(dx + " " + dy);
        }
        io.flush();
    }
}