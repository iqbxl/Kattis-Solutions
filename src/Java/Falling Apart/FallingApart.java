import java.util.Arrays;

public class FallingApart {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = io.getInt();
        }
        Arrays.sort(arr);
        int Alice = 0;
        int Bob = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr.length % 2 != 0) {
                if (i % 2 == 0) {
                    Alice += arr[i];
                } else {
                    Bob += arr[i];
                }
            } else {
                if (i % 2 == 0) {
                    Bob += arr[i];
                } else {
                    Alice += arr[i];
                }
            }
        }
        io.print(Alice + " " + Bob);
        io.flush();
    }
}