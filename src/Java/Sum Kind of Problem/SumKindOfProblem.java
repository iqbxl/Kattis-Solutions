public class SumKindOfProblem {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt();
        for (int i = 0; i < p; i++) {
            int k = io.getInt(), n = io.getInt();
            int S3 = n * (n + 1), S1 = S3 / 2, S2 = S3 - n;
            io.println(k + " " + S1 + " " + S2 + " " + S3);
        }
        io.flush();
    }
}