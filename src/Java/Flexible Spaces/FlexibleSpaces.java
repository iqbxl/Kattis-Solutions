import java.util.Set;
import java.util.TreeSet;

public class FlexibleSpaces {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int width = io.getInt();
        int partitions = io.getInt();
        Set<Integer> set = new TreeSet<>();
        int[] arr = new int[partitions + 2];
        arr[0] = 0; // front
        arr[arr.length - 1] = width; // end
        for (int i = 1; i < partitions + 1; i++) {
            arr[i] = io.getInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                set.add(arr[j] - arr[i]);
            }
        }
        String ans = "";
        for (int i : set) {
            ans += i + " ";
        }
        io.print(ans.trim());
        io.flush();
    }
}