public class Stopwatch {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        if (n % 2 != 0) {
            io.print("still running");
        } else {
            int sec = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sec -= io.getInt();
                } else if (i % 2 != 0) {
                    sec += io.getInt();
                }
            }
            io.print(sec);
        }
        io.flush();
    }
}