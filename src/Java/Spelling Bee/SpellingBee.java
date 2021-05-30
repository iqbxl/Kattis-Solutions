public class SpellingBee {
    
    public static boolean matchCenter(String center, String word) {
        boolean check = true;
        for (int i = 0; i < word.length(); i++) {
            if (!center.contains(word.substring(i, i + 1))) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String center = io.getWord();
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            String word = io.getWord();
            if (word.length() >= 4 && word.contains(center.substring(0, 1)) && matchCenter(center, word)) {
                io.println(word);
            }
        }
        io.flush();
    }
}