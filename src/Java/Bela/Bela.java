import java.util.HashMap;

public class Bela {
    public static void main(String args[]) {
        Kattio io = new Kattio(System.in);
        HashMap<String, Integer> dominant = new HashMap<String, Integer>() {
            {
                put("A", 11);
                put("K", 4);
                put("Q", 3);
                put("J", 20);
                put("T", 10);
                put("9", 14);
                put("8", 0);
                put("7", 0);
            }
        };
        
        HashMap<String, Integer> nonDominant = new HashMap<String, Integer>() {
            {
                put("A", 11);
                put("K", 4);
                put("Q", 3);
                put("J", 2);
                put("T", 10);
                put("9", 0);
                put("8", 0);
                put("7", 0);
            }
        };
        
        int n = io.getInt(), sum = 0;
        String domSuit = io.getWord();
        for (int i = 0; i < n * 4; i++) {
            String x = io.getWord();
            if (x.substring(1).equals(domSuit)) {
                sum += dominant.get(x.substring(0, 1));
            } else {
                sum += nonDominant.get(x.substring(0, 1));
            }
        }
        io.println(sum);
        io.flush();
    }
}