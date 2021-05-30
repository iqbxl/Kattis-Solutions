import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Conformity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[5];
            for (int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            String s = "";
            for (int j : arr) {
                s += j;
            }
            if (! map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        List<Integer> list = new ArrayList<>(); // use list to preserve the frequency of duplicates
        for (int i : map.values()) {
            list.add(i);
        }
        int max = Collections.max(list);
        int freq = 0;
        for (int i : list) {
            if (i == max) {
                freq++;
            }
        }
        System.out.println(max * freq);
        sc.close();
    }
}