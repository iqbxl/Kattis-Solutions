public class Herman {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt();
        io.println(Math.PI * r * r);
        io.println(2.0 * r * r);
        io.flush();
    }
}