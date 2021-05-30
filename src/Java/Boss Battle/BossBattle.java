public class BossBattle {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        n -= 2;
        if (n < 1) {
            io.print(1);
        } else {
            io.print(n);
        }
        io.flush();
    }
}