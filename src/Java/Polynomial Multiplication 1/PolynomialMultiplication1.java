public class PolynomialMultiplication1 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        while (t-- > 0) {
            int n1 = io.getInt();
            int[] arr1 = new int[n1 + 1];
            for (int i = 0; i <= n1; i++) {
                arr1[i] = io.getInt();
            }
            int n2 = io.getInt();
            int[] arr2 = new int[n2 + 1];
            for (int i = 0; i <= n2; i++) {
                arr2[i] = io.getInt();
            }
            io.println(n1 + n2);
            int[] res = new int[n1 + n2 + 1];
            for (int i = 0; i <= n1; i++) {
                for (int j = 0; j <= n2; j++) {
                    res[i + j] += arr1[i] * arr2[j];
                }
            }
            for (int i : res) {
                io.print(i + " ");
            }
            io.println();
        }
        io.flush();
    }
}