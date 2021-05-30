public class DifferentDistances {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            double x1 = io.getDouble();
            if (x1 == 0) break;
            double y1 = io.getDouble(), x2 = io.getDouble(),
                   y2 = io.getDouble(), p = io.getDouble();
            double power1 = Math.pow(Math.abs(x1 - x2), p);
            double power2 = Math.pow(Math.abs(y1 - y2), p);
            io.println(Math.pow((power1 + power2), 1 / p));
        }
        io.flush();
    }
}