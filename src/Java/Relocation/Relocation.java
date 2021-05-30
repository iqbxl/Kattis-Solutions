public class Relocation {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), q = io.getInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = io.getInt();
        }
        for (int i = 0; i < q; i++) {
            int type = io.getInt(), coy1 = io.getInt(), coy2 = io.getInt();
            if (type == 1) {
                A[coy1 - 1] = coy2;
            }
            if (type == 2) {
                io.println(Math.abs(A[coy1 - 1] - A[coy2 - 1]));
            }
        }
        io.flush();
    }
}