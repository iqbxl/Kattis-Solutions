import java.util.Arrays;
import java.util.HashMap;

public class ABC {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = io.getInt();
        }
        Arrays.sort(arr);
        map.put("A", arr[0]);
        map.put("B", arr[1]);
        map.put("C", arr[2]);
        String order = io.getWord();
        String res = "";
        for (int i = 0; i < 3; i++) {
            res += map.get(order.substring(i, i + 1)) + " ";
        }
        io.print(res);
        io.flush();
    }
}