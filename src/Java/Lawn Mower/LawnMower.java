import java.util.Arrays;

public class LawnMower {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (true) {
            int nx = io.getInt();
            int ny = io.getInt();
            double w = io.getDouble();
            if (nx == 0 && ny == 0 && w == 0) break;
            double[] arrA = new double[nx];
            double[] arrB = new double[ny];
            for (int i = 0; i < nx; i++) {
                arrA[i] = io.getDouble();
            }
            for (int i = 0; i < ny; i++) {
                arrB[i] = io.getDouble();
            }
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            if (check(arrA, w, 75) && check(arrB, w, 100)) {
                io.println("YES");
            } else {
                io.println("NO");
            }
        }
        io.flush();
    }

    private static boolean check(double arr[], double width, int length) {
        double half = width / 2;
        if (arr[0] - half > 0) { // check first index
            return false;
        }
        if (arr[arr.length - 1] + half < length) { // check last index
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) { // check everything in between
            if (arr[i] + half < arr[i + 1] - half) {
                return false;
            }
        }
        return true;
    }
}