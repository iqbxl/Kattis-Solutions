import java.util.Set;
import java.util.HashSet;

public class Karte {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getLine();
        int len = input.length() / 3;
        String[] cards = new String[len];
        for (int i = 0; i < len; i++) {
            cards[i] = input.substring(i * 3, i * 3 + 3);
        }
        Set<String> set = new HashSet<>();
        for (String i : cards) {
            set.add(i);
        }
        if (set.size() != cards.length) {
            io.println("GRESKA");
        } else {
            int p = 13;
            int k = 13;
            int h = 13;
            int t = 13;
            for (int i = 0; i < len; i++) {
                if (cards[i].contains("P")) {
                    p--;
                } else if (cards[i].contains("K")) {
                    k--;
                } else if (cards[i].contains("H")) {
                    h--;
                } else if (cards[i].contains("T")) {
                    t--;
                }
            }
            io.println(p + " " + k + " " + h + " " + t);
        }
        io.flush();
    }
}