public class Sibice {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), w = io.getInt(), h = io.getInt();
        double py = Math.sqrt(w * w + h * h);
        for (int i = 0; i < n; i++) {
            io.println(io.getInt() <= py ? "DA" : "NE");
            io.flush();
        }
    }
}