import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ClosingTheLoop {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int s = io.getInt();
            List<Integer> red = new ArrayList<>();
            List<Integer> blue = new ArrayList<>();
            io.print("Case #" + (i + 1) + ": ");
            for (int j = 0; j < s; j++) {
                String input = io.getWord();
                if (input.length() == 2) {
                    int l = Integer.parseInt(input.substring(0, 1));
                    if (input.substring(1, 2).equals("R")) {
                        red.add(l);
                    } else {
                        blue.add(l);
                    }
                } else if (input.length() == 3) {
                    int l = Integer.parseInt(input.substring(0, 2));
                    if (input.substring(2, 3).equals("R")) {
                        red.add(l);
                    } else {
                        blue.add(l);
                    }
                } else {
                    int l = Integer.parseInt(input.substring(0, 3));
                    if (input.substring(3, 4).equals("R")) {
                        red.add(l);
                    } else {
                        blue.add(l);
                    }
                }
            }
            Collections.sort(red, Collections.reverseOrder());
            Collections.sort(blue, Collections.reverseOrder());
            int count = 0;
            if (red.size() == 0 || blue.size() == 0) {
                io.print(0);
            } else if (red.size() == blue.size()) {
                for (int k : red) {
                    count += k - 1;
                }
                for (int k : blue) {
                    count += k - 1;
                }
                io.print(count);
            } else {
                int min = Math.min(red.size(), blue.size());
                for (int k = 0; k < min; k++) {
                    count += red.get(k) - 1;
                    count += blue.get(k) - 1;
                }
                io.print(count);
            }
            if (i != n - 1) {
                io.println();
            }
        }
        io.flush();
    }
}