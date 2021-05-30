import java.util.Arrays;

public class Cetiri {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = io.getInt();
        }
        Arrays.sort(arr);
        int diff1 = arr[1] - arr[0];
        int diff2 = arr[2] - arr[1];
        if (diff1 == diff2) {
            io.print(arr[2] + diff1);
        } else if (diff1 < diff2) {
            io.print(arr[1] + diff1);
        } else {
            io.print(arr[0] + diff2);
        }
        io.flush();
    }
}