import java.util.Arrays;

public class Inflation {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = io.getDouble();
        }
        Arrays.sort(arr);
        double max = 1.0;
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] > i + 1) {
                possible = false;
                break;
            }
            if (arr[i] / (i + 1) < max) {
                max = arr[i] / (i + 1);
            }
        }
        io.print(possible ? max : "impossible");
        io.flush();
    }
}