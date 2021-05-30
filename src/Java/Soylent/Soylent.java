public class Soylent {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        for (int i = 0; i < t; i++) {
            int n = io.getInt();
            io.println((int)Math.ceil(n/400.0));
        }
        io.flush();
    }
}