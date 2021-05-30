public class EulersNumber {
    public static double onedivfac(int n) {
        int num = 1;
        if (n == 0 || n == 1) {
               return 1.0;
        } else {
            return n * onedivfac(n - 1);
        }
    }
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        double res = 0;
        for (int i = 0; i <= n; i++) {
            res += (1 / onedivfac(i));
        }
        io.print(res);
        io.flush();
    }
}