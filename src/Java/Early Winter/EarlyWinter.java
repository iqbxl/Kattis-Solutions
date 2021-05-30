public class EarlyWinter {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int d = io.getInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (io.getInt() <= d) {
                io.print("It hadn't snowed this early in " + count + " years!");
                break;
            }
            count++;
        }
        if (count == n) {
            io.print("It had never snowed this early!");
        }
        io.flush();
    }
}