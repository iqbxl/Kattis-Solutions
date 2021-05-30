import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class BirthdayMemorization {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = io.getLine();
            String nameScore = line.substring(0, line.length() - 6);
            String birthday = line.substring(line.length() - 5);
            if (!map.containsKey(birthday)) {
                map.put(birthday, nameScore);
            } else {
                String[] tempNotMap = nameScore.split(" "); 
                String[] tempMap = map.get(birthday).split(" ");
                if (Integer.parseInt(tempNotMap[1]) > Integer.parseInt(tempMap[1])) {
                    map.put(birthday, nameScore);
                }
            }
        }
        io.println(map.size());
        String[] finalNames = new String[map.size()];
        int i = 0;
        for (String s : map.values()) {
            String[] arr = s.split(" ");
            finalNames[i] = arr[0];
            i++;
        }
        Arrays.sort(finalNames);
        for (String s : finalNames) {
            io.println(s);
        }
        io.flush();
    }
}