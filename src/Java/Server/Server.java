public class Server {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int t = io.getInt();
        int count = 0;
        int sum = 0;
        while (n-- > 0) {
            int time = io.getInt();
            sum += time;
            if (sum <= t) {
                count++;
            }
        }
        io.print(count);
        io.flush();
    }
}