public class LooRolls {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        long l = io.getLong();
        long n = io.getLong();
        int k = 1;
        while (l % n != 0) {
            n -= l % n;
            k++;
        }
        io.print(k);
        io.flush();
    }
}