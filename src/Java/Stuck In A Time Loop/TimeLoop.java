public class TimeLoop {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        if (n >= 1 && n <= 100) {
            for (int i = 1; i <= n; i++) {
                io.println(i + " Abracadabra\n");
            }
        }
        io.flush();
    }
}