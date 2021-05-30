import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class CostumeContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            if (!map.containsKey(input)) {
                map.put(input, 1);
            } else {
                map.put(input, map.get(input) + 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (String s : map.keySet()) {
            min = Math.min(min, map.get(s));
        }
        for (String s : map.keySet()) {
            if (map.get(s) == min) {
                System.out.println(s);
            }
        }
        sc.close();
    }
}