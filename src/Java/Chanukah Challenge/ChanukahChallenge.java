public class ChanukahChallenge {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt();
        while (p-- > 0) {
            int k = io.getInt(), n = io.getInt();
            io.println(k + " " + ((n + 1) * (n + 2) / 2 - 1));
        }
        io.flush();
    }
}