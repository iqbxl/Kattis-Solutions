public class JobExpenses {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), res = 0;
        for (int i = 0; i < n; i++) {
            int k = io.getInt();
            if (k < 0) {
                res += k;
            }
        }
        io.print(Math.abs(res));
        io.flush();
    }
}