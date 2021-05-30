import java.util.Arrays;

public class SquarePeg {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), m = io.getInt(), k = io.getInt();
        int[] plot = new int[n];
        double[] house = new double[m + k];
        for (int i = 0; i < n; i++) {
            plot[i] = io.getInt();
        }
        for (int i = 0; i < m; i++) {
            house[i] = io.getInt();
        }
        for (int i = m; i < m + k; i++) {
            house[i] = io.getInt() * Math.sin(Math.toRadians(45)); // change square to circular house (sine rule)
        }
        Arrays.sort(plot);
        Arrays.sort(house);
        int check = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = check; j < m + k; j++) {
                if (house[j] < plot[i]) {
                    max++;
                    check = j + 1; // increment check by j + 1 for each successful fit
                    break;
                }
            }
        }
        io.print(max);
        io.flush();
    }
}