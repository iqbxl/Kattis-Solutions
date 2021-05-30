public class JewelryBox {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        while (t-- > 0) {
            double x = io.getInt(), y = io.getInt();
            double h = (x + y - Math.sqrt(x * x + y * y - x * y)) / 6; // use dV / dh = 0 to find 
            io.println((x - 2 * h) * (y - 2 * h) * h);                 // quadratic equation for h
        }
        io.flush();
    }
}