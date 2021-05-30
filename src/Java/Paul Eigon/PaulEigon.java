public class PaulEigon {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int p = io.getInt();
        int q = io.getInt();
        if (((p + q) / n) % 2 == 0) {
            io.print("paul");
        } else {
            io.print("opponent");
        }
        io.flush();
    }
}