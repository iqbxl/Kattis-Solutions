public class TheEasiestProblem {
    public static int sumNums(int n) {
        return n == 0 ? n : (n % 10) + sumNums(n / 10);
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int n = io.getInt(), i = 11;
            if (n == 0) break;
            while (sumNums(n) != sumNums(n * i)) {
                i++;
            }
            io.println(i);
        }
        io.flush();
    }
}