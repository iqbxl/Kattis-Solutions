import java.util.HashSet;

public class Hangman {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        HashSet<Character> set = new HashSet<>();
        String word = io.getWord(), permu = io.getWord();
        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }
        String noDups = "";
        for (char c : set) {
            noDups += c;
        }
        int absent = 0;
        int present = 0;
        for (int i = 0; i < permu.length(); i++) {
            if (!noDups.contains(permu.substring(i, i + 1))) {
                absent++;
                if (absent == 10) {
                    io.println("LOSE");
                    break;
                }
            } else {
                present++;
                if (present == noDups.length()) {
                    io.println("WIN");
                    break;
                }
            }
        }
        io.flush();
    }
}