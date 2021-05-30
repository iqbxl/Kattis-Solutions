public class OddGnome {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int g = io.getInt();
            int[] A = new int[g];
            int first = 0;
            for (int j = 0; j < g; j++) {
                int num = io.getInt();
                if (j == 0) {
                    first = num;
                }
                A[j] = num;
            }
            for (int j = 0; j < g; j++) {
                if (A[j] != first) {
                    io.println(j + 1);
                    break;
                }
                first++;
            }
            
        }
        io.flush();
    }
}