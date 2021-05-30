import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Prerequisites {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter dc = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while (true) {
            String line = sc.readLine();
            if (line.equals("0")) {
                break;
            }
            String[] temp = line.split(" ");
            int k = Integer.parseInt(temp[0]);
            int m = Integer.parseInt(temp[1]);

            Set<Integer> set = new HashSet<>();
            String[] courses = sc.readLine().split(" ");
            for (int i = 0; i < k; i++) {
                set.add(Integer.parseInt(courses[i]));
            }

            boolean check = true;
            int i = 0;
            for (; i < m && check; i++) {
                String[] cat = sc.readLine().split(" ");
                int c = Integer.parseInt(cat[0]);
                int r = Integer.parseInt(cat[1]);
                int hasMet = 0;
                for (int j = 2; j < c + 2; j++) {
                    int course = Integer.parseInt(cat[j]);
                    if (set.contains(course)) {
                        hasMet++;
                    }
                }
                check = hasMet >= r;
            }
            for (; i < m; i++) {
                sc.readLine();
            }
            dc.println(check ? "yes" : "no");
        }
        dc.close();
        sc.close();
    }
}