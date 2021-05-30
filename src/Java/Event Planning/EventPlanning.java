import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EventPlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean status = false;
        int minCost = Integer.MAX_VALUE;
        while (h-- > 0) {
            int p = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < w; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            for (int i : list) {
                if (i >= n) {
                    minCost = Math.min(minCost, p * n);
                    break;
                }
            }
            if (minCost <= b) {
                status = true;
            }
        }
        System.out.println(status ? minCost : "stay home");
        sc.close();
    }
}