import java.util.Map;
import java.util.HashMap;

public class Marko {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('b', 2);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 3);
        map.put('f', 3);
        map.put('g', 4);
        map.put('h', 4);
        map.put('i', 4);
        map.put('j', 5);
        map.put('k', 5);
        map.put('l', 5);
        map.put('m', 6);
        map.put('n', 6);
        map.put('o', 6);
        map.put('p', 7);
        map.put('q', 7);
        map.put('r', 7);
        map.put('s', 7);
        map.put('t', 8);
        map.put('u', 8);
        map.put('v', 8);
        map.put('w', 9);
        map.put('x', 9);
        map.put('y', 9);
        map.put('z', 9);
        int n = io.getInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = io.getWord();
        }
        String s = io.getWord();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (words[i].length() != s.length()) {
                continue;
            }
            boolean correct = true;
            for (int j = 0; j < s.length(); j++) {
                if (map.get(words[i].charAt(j)) != Integer.parseInt(s.substring(j, j + 1))) {
                    correct = false;
                    break;
                }
            }
            if (correct) {
                ans++;
            }
        }
        io.print(ans);
        io.flush();
    }
}