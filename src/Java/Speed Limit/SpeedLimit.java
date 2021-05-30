public class SpeedLimit {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int n = io.getInt();
            if (n == -1) {
                break;
            }
            int result = 0, init = 0;
            for (int i = 0; i < n; i++) {
                int a = io.getInt();
                int b = io.getInt();
                result += a * (b - init);
                init = b;
            }
            io.println(result + " miles");
            io.flush();
        }
    }
}