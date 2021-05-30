import java.util.HashMap;
import java.util.ArrayList;
public class ACM {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        HashMap<String, Integer> right = new HashMap<>();
        HashMap<String, Integer> wrong = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int solved = 0, time = 0;
        while (true) {
            int m = io.getInt();
            if (m == -1) break;
            String problem = io.getWord(), result = io.getWord();
            if (result.equals("wrong")) {
                if (!wrong.containsKey(problem)) {
                    wrong.put(problem, 20);
                } else {
                    wrong.put(problem, wrong.get(problem) + 20);
                }
            }
            else if (result.equals("right")) {
                solved++;
                right.put(problem, m);
                if (wrong.containsKey(problem)) {
                    list.add(problem);
                }
            }
        }
        for (int i : right.values()) {
            time += i;
        }
        for (String str : list) {
            time += wrong.get(str);
        }
        io.print(solved + " " + time);
        io.flush();
    }
}