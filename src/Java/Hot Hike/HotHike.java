import java.util.Arrays;

public class HotHike {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int[] temps = new int[n];
        for (int i = 0; i < n; i++) {
            temps[i] = io.getInt();
        }
        int max = Arrays.stream(temps).max().getAsInt(), idx = 0; //stream method to find max integer in array

        for (int i = 0; i < n - 2; i++) {
            int higher = Math.max(temps[i], temps[i + 2]); //Math.max() to compare greater value of 2 nos
            if (higher < max) {
                max = higher;
                idx = i;
            }
        }
        io.print(idx + 1 + " " + max);
        io.flush();
    }
}