import java.util.Arrays;

public class PermutedArithmeticSequence {
    private static boolean isArithmetic(int[] arr) {
        boolean check = true;
        int d = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != d) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        while (n-- > 0) {
            int m = io.getInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = io.getInt();
            }
            if (isArithmetic(arr)) {
                io.println("arithmetic");
            } else {
                Arrays.sort(arr);
                if (isArithmetic(arr)) {
                    io.println("permuted arithmetic");
                } else {
                    io.println("non-arithmetic");
                }
            }
        }
        io.flush();
    }
}