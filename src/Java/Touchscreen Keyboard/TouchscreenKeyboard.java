import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collections;

public class TouchscreenKeyboard {
    
    private static String first = "qwertyuiop";
    private static String second = "asdfghjkl";
    private static String third = "zxcvbnm";

    private static int yValue(char x) {
        if (first.contains(x + "")) {
            return 1;
        } else if (second.contains(x + "")) {
            return 2;
        } else {
            return 3;
        }
    }

    private static int xValue(char x) {
        if (first.contains(x + "")) {
            return first.indexOf(x); // use indexOf() to find index of char in a string
        } else if (second.contains(x + "")) {
            return second.indexOf(x);
        } else {
            return third.indexOf(x);
        }
    }

    private static int charDistance(char a, char b) {
        int ax = xValue(a);
        int ay = yValue(a);
        int bx = xValue(b);
        int by = yValue(b);
        return Math.abs(ax - bx) + Math.abs(ay - by);
    }

    private static int distance(String s1, String s2) { // method to find distance btw two words
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            sum += charDistance(s1.charAt(i), s2.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();
        while (t-- > 0) {
            String typed = io.getWord();
            int l = io.getInt();
            List<String> entries = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < l; i++) {
                String word = io.getWord();
                entries.add(word);
                map.put(word, distance(typed, word));
            }
            Collections.sort(entries, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    int n1 = map.get(s1);
                    int n2 = map.get(s2);
                    if (n1 == n2) {
                        return s1.compareTo(s2); // ensures lexicographic order when sorting if same distance
                    } else {
                        return n1 - n2; // ensures words/entries are sorted in ascending order
                    }
                }
            }); // now sorted already according to requirements
            for (int i = 0; i < entries.size(); i++) {
                io.println(entries.get(i) + " " + map.get(entries.get(i)));
            }
        }
        io.flush();
    }
}