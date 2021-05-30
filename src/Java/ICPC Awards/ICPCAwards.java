import java.util.LinkedHashMap; //LinkedHashMap maintains insertion order, on top of containing unique elements
import java.util.Map;           //HashMap doesn't allow duplicate keys, but allows duplicate values

public class ICPCAwards {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String uni = io.getWord();
            String team = " " + io.getWord();
            if (!map.containsKey(uni) && map.size() < 12) {
                map.put(uni, team);
            }
        }
        for (Map.Entry<String, String> m : map.entrySet()) {
            io.println(m.getKey() + m.getValue());
        }
        io.flush();
    }
}