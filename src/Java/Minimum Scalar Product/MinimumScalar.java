import java.util.Arrays;

public class MinimumScalar {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        int k = 1;
        while (t-- > 0) {
            io.print("Case #" + k++ + ": ");
            int n = io.getInt();
            int[] arrX = new int[n];
            int[] arrY = new int[n];
            for (int i = 0; i < n; i++) {
                arrX[i] = io.getInt();
            }
            for (int j = 0; j < n; j++) {
                arrY[j] = io.getInt();
            }
            Arrays.sort(arrX);
            Arrays.sort(arrY); // or can sort one of the arrays in reverse order and multiply same indexes
            long minProduct = 0;
            for (int i = 0; i < n; i++) {
                minProduct += (long) arrX[i] * arrY[n - 1 - i];
            }
            io.println(minProduct);
        }
        io.flush();
    }
}