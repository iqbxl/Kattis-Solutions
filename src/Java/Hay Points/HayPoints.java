import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class HayPoints {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = sc.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String[] line = sc.readLine().split(" ");
            map.put(line[0], Integer.parseInt(line[1]));
        }
        
        while (n-- > 0) {
            int salary = 0;
            while (true) {
                String text = sc.readLine();
                if (text.equals(".")) {
                    break;
                }
                String[] temp = text.split(" ");
                for (int i = 0; i < temp.length; i++) {
                    if (map.containsKey(temp[i])) {
                        salary += map.get(temp[i]);
                    }
                }
            }
            dc.write(salary + "\n");
        }
        dc.close();
        sc.close();
    }
}