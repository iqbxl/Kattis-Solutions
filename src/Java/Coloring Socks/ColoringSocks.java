import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ColoringSocks {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int s = io.getInt(), c = io.getInt(), k = io.getInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = io.getInt();
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);                 // add first sock
        int res = 1;
        for (int i = 0; i < s - 1; i++) { // last index of loop is s - 1 to prevent array out of bounds error
            if (list.size() < c && arr[i + 1] - arr[i] <= k) {
                list.add(arr[i + 1]);
            } else {
                list.clear();             // clear the list everytime any condition is not met to start from 0
                list.add(arr[i + 1]);     // add the elem that starts a fresh list
                res++;
            }
        }
        io.print(res);
        io.flush();
    }
}