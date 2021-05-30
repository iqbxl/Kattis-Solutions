public class Arrangement {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int m = io.getInt();
        int remainder = m % n;
        int quotient = m / n;
        for (int i = 0; i < remainder; i++) {
            for (int j = 0; j < quotient + 1; j++) {
                io.print('*');
            }
            io.println();
        }
        for (int i = 0; i < n - remainder; i++) {
            for (int j = 0; j < quotient; j++) {
                io.print('*');
            }
            io.println();
        }
        io.flush();
    }
}