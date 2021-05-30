import java.util.Arrays;

public class Akcija {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = io.getInt();
        }
        Arrays.sort(arr);
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (n % 3 == 0) {
                if (i % 3 != 0) {
                    min += arr[i];
                }
            } else if (n % 3 == 1) {
                if (i % 3 != 1) {
                    min += arr[i];
                }
            } else {
                if (i % 3 != 2) {
                    min += arr[i];
                }
            }
        }
        io.print(min);
        io.flush();
    }
}