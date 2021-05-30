public class RoamingRomans {
    public static void main(String[] wtv) {
        Kattio io = new Kattio(System.in);
        double x = io.getDouble();
        io.println(Math.round(x * 5280000 / 4854));
        io.flush();
    }
}