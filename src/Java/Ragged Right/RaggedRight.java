import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RaggedRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> len = new ArrayList<>();
        while (sc.hasNext()) {
            len.add(sc.nextLine().length());
        }
        int max = Collections.max(len);
        len.remove(len.size() - 1);
        int raggedness = 0;
        for (int i : len) {
            raggedness += (max - i) * (max - i);
        }
        System.out.println(raggedness);
        sc.close();
    }
}